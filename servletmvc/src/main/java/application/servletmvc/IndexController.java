package application.servletmvc;

import java.lang.ProcessBuilder.Redirect;
import java.security.Principal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.enterprise.inject.New;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import application.jconfig.dao.AdminDao;
import application.jconfig.dao.CategoryDao;
import application.jconfig.dao.CustomerDao;
import application.jconfig.dao.SubCategoryDao;
import application.jconfig.dao.UserDao;
import application.jconfig.dao.VendorDao;
import application.jconfig.model.Admin;
import application.jconfig.model.Customer;
import application.jconfig.model.Login;
import application.jconfig.model.SubCategory;
import application.jconfig.model.User;
import application.jconfig.model.Vendor;

@Controller
public class IndexController {
	
	@Autowired
	private VendorDao vendorDao;
	
	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private SubCategoryDao subCategoryDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private AdminDao adminDao;
	
	
	@GetMapping(value = { "/" })
	public ModelAndView indexPage(Model model,HttpSession session) {
		ModelAndView mav=new ModelAndView("index");
		
		session.setAttribute("electronics",subCategoryDao.getElectronics());
	    
		return mav;
	}
	
	@GetMapping("index")
	public ModelAndView openIndex() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@GetMapping("adminlogin")
	public String adminlogin() {
		return "adminlogin";
	}
	
	@GetMapping("/admin/adminpage")
	public ModelAndView openAdminPage() {
		ModelAndView modelAndView = new ModelAndView("adminpage");
		return modelAndView;
	}
	
	@GetMapping("/admin/adminprofile")
	public String getAdminDetails() {
		return "adminprofile";
		
	}
	
	@GetMapping("admin/vendordetails")
	public String getVendorDetails(Map<String, Object> vendors) {
		vendors.put("vendorList", vendorDao.getAllVendorDetails());
		return "vendordetails";
	}

	@GetMapping("admin/accept/{vendorId}")
	public String acceptVendor(@PathVariable("vendorId")int vendorId) {
		
		Vendor vendor=vendorDao.getVendorById(vendorId);
		vendor.setStatus(true);
		vendorDao.updateVendor(vendor);
		return "redirect:/admin/vendordetails";
	}
	
	@GetMapping("admin/reject/{vendorId}")
	public String rejectVendor(@PathVariable("vendorId")int vendorId) {
		
		Vendor vendor=vendorDao.getVendorById(vendorId);
		vendor.setStatus(false);
		vendorDao.updateVendor(vendor);
		return "redirect:/admin/vendordetails";
	}
	
	
}
