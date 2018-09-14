package application.servletmvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.jconfig.dao.CategoryDao;
import application.jconfig.dao.LaptopDao;
import application.jconfig.dao.MobileDao;
import application.jconfig.dao.ProductDao;
import application.jconfig.dao.SubCategoryDao;
import application.jconfig.dao.TelevisionDao;
import application.jconfig.dao.VendorDao;
import application.jconfig.model.NumberOfProducts;
import application.jconfig.model.Product;
import application.jconfig.model.SubCategory;
import application.jconfig.model.Vendor;
import application.jconfig.model.product.Laptop;
import application.jconfig.model.product.Mobile;
import application.jconfig.model.product.Television;

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
	
	@Autowired
	private TelevisionDao televisionDao;
	
	@Autowired
	private VendorDao vendorDao;
	
	@Autowired
	private ProductDao productDao;
	
	@PostMapping("subcategory")
	public String getSubCategory(@RequestParam("category")int categoryId,Model model) {
		model.addAttribute("subCategoryList", subCategoryDao.getsubCategories(categoryId));
		model.addAttribute("categoryName", categoryDao.getCategoryById(categoryId));
		return "subcategory";
	}
	
	@PostMapping("getmodel")
	public String addProducts(HttpServletRequest httpServletRequest,Model model,HttpSession session) {
		
		SubCategory subCategory=subCategoryDao.getSubCategory(Integer.parseInt(httpServletRequest.getParameter("subCategoryId")));
		model.addAttribute("subCategoryId", subCategory.getSubCategoryId());
		Vendor vendor=(Vendor)session.getAttribute("vendorDetails");
		model.addAttribute("vendorId", vendor.getVendorId());
		
		switch (subCategory.getSubCategoryName()) {

		case "mobile":model.addAttribute("mobile",new Mobile());
		return "mobilepage";

		case "laptop":model.addAttribute("laptop", new Laptop());
		return "laptop";
		
		case "television":model.addAttribute("television", new Television());
		return "television";
		
		default:return "subcategory";
		
		}
		
	}
	
	@PostMapping("laptopprocess")
	public String addLaptopProcess(@ModelAttribute("laptop")Laptop laptop) {
		
		laptopDao.addLaptop(laptop);
		return "vendorpage";
	}
	
	@PostMapping("televisionprocess")
	public String addTelevisionProcess(@ModelAttribute("television")Television television) {
		
		televisionDao.addTelevision(television);
		return "vendorpage";
		
	}
	
	@PostMapping("mobileprocess")
	public String addMobileProcess(@ModelAttribute("mobile")Mobile mobile,HttpSession httpSession,HttpServletRequest request) {
		List<NumberOfProducts> numberOfProducts=listOfProducts(mobile);
		mobile.setNumberOfProducts(numberOfProducts);
			
		if(mobileDao.addMobile(mobile)) {
			
			String contextPath=request.getRealPath("/");
			File file=new File(contextPath+"/resources/images/products");
			
			if(!file.exists()) {
				file.mkdir();
			}
			
			FileOutputStream fileOutputStream=null;
			try {
				fileOutputStream=new FileOutputStream(file.getPath()+"/"+mobile.getProductId()+".jpg");
				System.out.println(mobile.getImage());
				System.out.println(mobile.getBrand());
				InputStream inputStream=mobile.getImage().getInputStream();
				byte[] imageBytes=new byte[inputStream.available()];
				inputStream.read(imageBytes);
				
				fileOutputStream.write(imageBytes);
				fileOutputStream.flush();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				 try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			return "vendorpage";
		}
		else {
			return "getModel";
		}

	}
	
	private List<NumberOfProducts> listOfProducts(Product product){
		List<NumberOfProducts> numberOfProductsList=new ArrayList<NumberOfProducts>();
		for(int i=1;i<=product.getNumOfProducts();i++)
		{
			NumberOfProducts numberOfProducts=new NumberOfProducts();
			numberOfProducts.setProduct(product);
			numberOfProductsList.add(numberOfProducts);
		}	
		return numberOfProductsList;
	}

	@GetMapping("productdetails")
	public String getProducts(HttpSession session,Model model,Map<String, Object>products) {
		Vendor vendor=(Vendor)session.getAttribute("vendorDetails");
		products.put("productList", productDao.getAllProducts(vendor.getVendorId()));
		
	    session.setAttribute("products",products);
		return "productdetails";	
	}
	
	@GetMapping("viewproductspecifications/{productId}")
	public String viewProducts(@PathVariable("productId")int productId,Model model) {
		String name=subCategoryDao.getSubCategory(productDao.getSubCategoryId(productId)).getSubCategoryName();
		
		switch (name) {
		case "Mobile":model.addAttribute("mobile", mobileDao.getMobileDetails(productId));
			return "mobilespecs";
		
		case "Laptop":model.addAttribute("laptop", laptopDao.getLaptopDetails(productId));
			return "laptopspecs";

		default:return "productdetails";
			
		}	
		
	}
	
	
	
	
}
