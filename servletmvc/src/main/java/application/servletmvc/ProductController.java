package application.servletmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.jconfig.dao.CategoryDao;
import application.jconfig.dao.LaptopDao;
import application.jconfig.dao.MobileDao;
import application.jconfig.dao.SubCategoryDao;
import application.jconfig.model.product.Laptop;
import application.jconfig.model.product.Mobile;

@Controller
public class ProductController {
	
	@Autowired
	private SubCategoryDao subCategoryDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private MobileDao mobileDao;
	
	@Autowired
	private LaptopDao laptopDao;
	
	@PostMapping("subcategory")
	public String getSubCategory(@RequestParam("category")int categoryId,Model model) {
		model.addAttribute("subCategoryList", subCategoryDao.getsubCategories(categoryId));
		model.addAttribute("categoryName", categoryDao.getCategoryById(categoryId));
		return "subcategory";
	}
	
	@PostMapping("getmodel")
	public String addProducts(HttpServletRequest httpServletRequest,Model model) {
		switch (httpServletRequest.getParameter("subCategoryName")) {
		
		case "mobile":model.addAttribute("mobile",new Mobile());
		return "mobile";

		case "laptop":model.addAttribute("laptop", new Laptop());
		return "laptop";
		
		default:return "subcategory";
		
		}
		
	}
	
	@PostMapping("mobileprocess")
	public String addMobileProcess(@ModelAttribute("mobile")Mobile mobile) {
		
		mobileDao.addMobile(mobile);
		return "vendorindex";
	}
	
	@PostMapping("laptopprocess")
	public String addLaptopProcess(@ModelAttribute("laptop")Laptop laptop) {
		
		laptopDao.addLaptop(laptop);
		return "vendorindex";
	}
	
	 
}
