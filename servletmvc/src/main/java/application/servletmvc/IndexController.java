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

import application.jconfig.dao.UserDao;
import application.jconfig.dao.VendorDao;
import application.jconfig.model.Login;
import application.jconfig.model.User;
import application.jconfig.model.Vendor;

@Controller
public class IndexController {
	
	/*@Autowired
	private UserDao userDao;*/
	
	@Autowired
	private VendorDao vendorDao;
	
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
	public ModelAndView indexPage() {
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
		   
		    return "redirect:vendorindex";
		 
	   }
	   else {
		   
		   return "vendorsignin";
	   }
	}
	
	/*@RequestMapping(value= {"/signup"},method=RequestMethod.GET)
	public String signup(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@PostMapping("/register")
	public String reister(@Valid @ModelAttribute("user")User user,BindingResult result,Model model) {
		System.out.println(result.hasErrors());
		if(!result.hasErrors())
		{
			if(userDao.getUserByEmail(user.getEmail())==null) {
				userDao.addUser(user);
				return "redirect:/login";
			}
			else {
				model.addAttribute("message", "email is already existed");
				return "signup";
			}
		}else {
			return "signup";
		}
		
	}
	
	@GetMapping("/login")
	public String loginPage(Model model){
		model.addAttribute("login", new Login());
		return "/login";
	}
	
	@PostMapping("/loginprocess")
	public String login(@ModelAttribute("login")Login login,HttpSession httpSession) {
		if( userDao.login(login.getEmail(), login.getPassword()) != null) {
			User user= userDao.login(login.getEmail(), login.getPassword());
			httpSession.setAttribute("profile", user);
			
			if(user.getRole().equalsIgnoreCase("admin")) {
				   return  "adminpage";
			   }else 
			   if(user.getRole().equalsIgnoreCase("vendor")) {
				   return  "vendorpage";
			   } else
			  
				   return  "customerpage";
		   		}
				
		else {
			return "login";
		}
	
	}
	
	
	
	@GetMapping("/profile")
	public String profile() {
		
		return "profile";
	}
	
	@GetMapping(value= {"edit"})
	public String updateProfile(HttpSession httpSession,Model model) {
		model.addAttribute("user", httpSession.getAttribute("profile"));
		return "editprofile";
	}
	
	@PostMapping("updateprofile")
	public String updateProfileProcess(@ModelAttribute("user")User user,HttpSession httpSession) {
		httpSession.setAttribute("profile", user);
		userDao.updateUser(user);
		return "redirect:profile";	
	}
	
	@GetMapping("userdetails")
	public String getUserDetails(Map<String ,Object> user) {
		user.put("userList", userDao.getVendorDetails());	
		return "userdetails";
	}
	
	@GetMapping("userprofile")
	public String getUserDetails() {
		return "userprofile";
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
		
	}*/
	
}
