package application.servletmvc;

import java.lang.ProcessBuilder.Redirect;
import java.util.Date;

import javax.enterprise.inject.New;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.support.HttpAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@Autowired
	private UserDao userDao;
	
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
	
	@RequestMapping(value= {"/signup"},method=RequestMethod.GET)
	public String signup(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@PostMapping("/register")
	public String reister(@ModelAttribute("user")User user) {
		if(userDao.getUserByEmail(user.getEmail())==null) {
			userDao.addUser(user);
			return "redirect:/login";
		}
		else {
			return "signup";
		}
	}
	
	@GetMapping("/login")
	public String loginPage(Model model){
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@PostMapping("/loginprocess")
	public String login(@ModelAttribute("login")Login login,HttpSession httpSession) {
		if( userDao.login(login.getEmail(), login.getPassword()) != null) {
			User user= userDao.login(login.getEmail(), login.getPassword());
			httpSession.setAttribute("profile", user);
			return "profile";
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
	public String updateProfile(@ModelAttribute("user") User user,HttpSession httpSession) {
		System.out.println(user.getUserId());
		httpSession.setAttribute("profile", user);
		userDao.updateUser(user);
		return "redirect:profile";
	}

}
