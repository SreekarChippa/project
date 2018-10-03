package application.servletmvc;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import application.jconfig.dao.CustomerDao;
import application.jconfig.model.Customer;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;
	
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
	
	@GetMapping("/customer/customerpage")
	public ModelAndView openCustomerPage() {
		ModelAndView view=new ModelAndView("customerpage");
		return view;
	}
	
	
	
	@GetMapping("customerprofile")
	public String getCustomerDetails() {
		return "customerprofile";
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

}
