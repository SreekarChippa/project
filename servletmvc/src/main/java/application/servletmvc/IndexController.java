package application.servletmvc;

import java.lang.ProcessBuilder.Redirect;
import java.util.Date;
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
import application.jconfig.model.Customer;
import application.jconfig.model.Login;
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
	
	/*	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		ModelAndView mav=new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/aboutus")
	public ModelAndView aboutUs(){
		ModelAndView mav2=new ModelAndView("AboutUs");
		mav2.addObject("date", new Date());
		return mav2;
	}
	
	@RequestMapping("/contact")
	public String contactUs(Model model) {
		model.addAttribute("contact", "7032343530");
		return "ContactUs";
	}
	
	*/
	
	@RequestMapping("/")
	public ModelAndView indexPage(Model model) {
		model.addAttribute("subCategory", subCategoryDao.getAllSubCategories());
		ModelAndView mav=new ModelAndView("index");
		return mav;
	}
	
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
	
	@PostMapping("vendorloginprocess")
	public  String  loginVendor(HttpServletRequest request,HttpSession session)
	{
		
	   if((vendorDao.login(request.getParameter("email"),request.getParameter("password")))!=null) {
		   
		   Vendor vendor=vendorDao.login(request.getParameter("email"),request.getParameter("password"));
		   
		   session.setAttribute("vendorDetails",vendor);
		   
		    return "vendorpage";
	   }
	   else {	   
		   return "vendorlogin";
	   }
	}
	
	
	@GetMapping(value= {"customersignup"})
	public String signupCustomer(Model model)
	{
		model.addAttribute("customer", new Customer());
		
		return "customersignup";
	}
	
	@PostMapping("customerregisterprocess")
	public String singupCustomerProcess(@ModelAttribute("customer")Customer customer) {
	
		if((customerDao.getCustomerByEmail(customer.getEmail()))!=null) {
		
			 return "customersignup";
		}
		else {
			customerDao.registerCustomer(customer);
			return "index";
		}
	}
	
	@GetMapping("customerlogin")
	public String loginCustomer()
	{
		return "customerlogin";
	}
	
	@PostMapping("customerloginprocess")
	public  String  logincustomer(HttpServletRequest request,HttpSession session)
	{
		
	   if((customerDao.loginCustomer(request.getParameter("email"),request.getParameter("password")))!=null) {
		   
		   Customer customer=customerDao.loginCustomer(request.getParameter("email"),request.getParameter("password"));
		   
		   session.setAttribute("customerDetails",customer);
		   
		    return "customerpage";
		 
	   }
	   else {
		   
		   return "customerlogin";
	   }
	}
	
	@GetMapping("categories")
	public String getCategories(Map<String, Object> categories) {
		categories.put("categoryList", categoryDao.getCategories());
		return "categories";
	}
	
	@GetMapping("vendorprofile")
	public String getVendorDetails() {
		return "vendorprofile";
	}
	
	@GetMapping(value= {"editvendor"})
	public String updateVendor(HttpSession httpSession,Model model)
	{
		model.addAttribute("vendor", httpSession.getAttribute("vendorDetails"));
		return "vendoredit";
	}
	
	@PostMapping("vendorupdateprocess")
	public String vendorUpdateProcess(@ModelAttribute("vendor")Vendor vendor,HttpSession session) {

		    session.setAttribute("vendorDetails", vendor);
			vendorDao.updateVendor(vendor);
		    return  "vendorpage";
			 
	}
	
	@GetMapping("customerprofile")
	public String getCustomerDetails() {
		return "redirect:/customerprofile";
	}
	
	@GetMapping(value= {"editcustomer"})
	public String updateCustomer(HttpSession httpSession,Model model)
	{
		model.addAttribute("customer", httpSession.getAttribute("customerDetails"));
		return "redirect:/customeredit";
	}
	
	@PostMapping("customerupdateprocess")
	public String customerUpdateProcess(@ModelAttribute("customer")Customer customer,HttpSession session) {

		    session.setAttribute("customerDetails", customer);
			customerDao.updateCustomer(customer);
		    return  "customerpage"; 
	}
	
	
	@GetMapping("accept/{userId}")
	public String acceptUser(@PathVariable("userId")int userId) {
		
		User user=userDao.getUserById(userId);
		user.setStatus(true);
		userDao.updateUser(user);
		return "redirect:/userdetails";
		
	}
	
	@GetMapping("reject/{userId}")
	public String rejectUser(@PathVariable("userId")int userId) {
		
		User user=userDao.getUserById(userId);
		user.setStatus(false);
		userDao.updateUser(user);
		return "redirect:/userdetails";
		
	}
	
	
}
