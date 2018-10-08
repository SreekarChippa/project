package application.servletmvc;

import java.security.Principal;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import application.jconfig.dao.CategoryDao;
import application.jconfig.dao.SubCategoryDao;
import application.jconfig.dao.VendorDao;
import application.jconfig.model.Vendor;

@Controller
public class VendorController {
	
	@Autowired
	private VendorDao vendorDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private SubCategoryDao subCategoryDao; 
	
	@GetMapping(value= {"vendorsignup"})
	public String signupVendor(Model model)
	{
		model.addAttribute("vendor", new Vendor());
		
		return "vendorsignup";
	}
	
	@PostMapping("vendorregisterprocess")
	public String singupVendorProcess(@ModelAttribute("vendor")Vendor vendor) {
	
		if((vendorDao.getVendorByEmail(vendor.getEmail()))!=null) {
		
			 return "vendorsignup";
		}
		else {
			vendorDao.registerVendor(vendor);
			return "index";
		}
	}
	
	@GetMapping("vendorlogin")
	public String login()
	{
		return "vendorlogin";
	}
	
	@GetMapping("/vendor/vendorpage")
	public ModelAndView openVendorPage(HttpSession session,Principal principal) {
		Vendor vendor=vendorDao.getVendorByEmail(principal.getName());
		ModelAndView view=new ModelAndView("vendorpage");
		session.setAttribute("vendorDetails", vendor);
		return view;
	}
	
	@GetMapping("/vendor/categories")
	public String getCategories(Map<String, Object> categories) {
		categories.put("categoryList", categoryDao.getCategories());
		return "categories";
	}
	
	@GetMapping("vendor/vendorprofile")
	public String getVendorAllDetails() {
		return "vendorprofile";
	}
	
	@GetMapping(value= {"vendor/editvendor"})
	public String updateVendor(Model model,HttpSession session)
	{
		
		model.addAttribute("vendor",session.getAttribute("vendorDetails"));
		return "vendoredit";
	}
	
	@PostMapping("vendor/vendorupdateprocess")
	public String vendorUpdateProcess(@ModelAttribute("vendor")Vendor vendor,HttpSession session) {

		    session.setAttribute("vendorDetails", vendor);
			vendorDao.updateVendor(vendor);
		    return  "vendorpage";
			 
	}

}
