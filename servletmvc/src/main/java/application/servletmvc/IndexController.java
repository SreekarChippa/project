package application.servletmvc;

import java.lang.ProcessBuilder.Redirect;
import java.util.Date;

import javax.enterprise.inject.New;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import application.jconfig.dao.VendorDao;
import application.jconfig.model.Login;
import application.jconfig.model.Vendor;

@Controller
public class IndexController {
	
	@Autowired
	private VendorDao vendorDao;
	
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
	
	@RequestMapping(value= {"/signup"},method=RequestMethod.GET)
	public String signUp(Model model) {
		model.addAttribute("vendor", new Vendor());
		return "signup";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute("vendor")Vendor vendor) {
		if((vendorDao.getVendorByEmail(vendor.getEmail()))!=null) {
			return "redirect:/signup";
		}
		else{
			vendorDao.addVendor(vendor);
			return "login";
		}

	}
	
	@GetMapping("/login")
	public String loginPage(Model model){
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@PostMapping("/loginprocess")
	public String login(@ModelAttribute("login")Login login,Model model) {
		if(vendorDao.login(login.getEmail(), login.getPassword()) != null) {
			Vendor vendor= vendorDao.login(login.getEmail(), login.getPassword());
			model.addAttribute("profile", vendor);
			return "profile";
		}
		else {
			return "login";
		}
				
	}
	
	@GetMapping
	public String updateProfile("/profile") {
		
		return null;
		
	}
	
	public String update(@ModelAttribute("vendor") Vendor vendor) {
		if(vendorDao.updateVendor(vendor)) {
			return "redirect:/homepage"
		}
		else {
			return "update";
		}
	}
	

}
