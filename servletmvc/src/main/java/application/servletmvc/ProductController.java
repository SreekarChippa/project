package application.servletmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.jconfig.dao.CategoryDao;
import application.jconfig.dao.SubCategoryDao;
import application.jconfig.model.product.Mobile;

@Controller
public class ProductController {
	
	@Autowired
	private SubCategoryDao subCategoryDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
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

		default:return "subcategory";
		
		}
		
	}
	 
}
