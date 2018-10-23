package application.servletmvc;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import application.jconfig.dao.CartDao;
import application.jconfig.dao.CartItemIdDao;
import application.jconfig.dao.CartItemsDao;
import application.jconfig.dao.CustomerDao;
import application.jconfig.dao.NumberOfProductsDao;
import application.jconfig.dao.ProductDao;
import application.jconfig.dao.VendorDao;
import application.jconfig.model.Cart;
import application.jconfig.model.CartItemId;
import application.jconfig.model.CartItems;
import application.jconfig.model.Customer;
import application.jconfig.model.NumberOfProducts;
import application.jconfig.model.Product;

@Controller
public class CartController {

	@Autowired
	private NumberOfProducts numberOfProducts;
	
	@Autowired
	private NumberOfProductsDao numberOfProductsDao; 
	
	@Autowired
	private Customer customer;
	
	@Autowired
	private CustomerDao customerDao;
	
	@Autowired
	private Cart cart;
	
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private CartItems cartItems;
	
	@Autowired
	private CartItemsDao cartItemsDao;
	
	@Autowired
	private CartItemId cartItemId;
	
	@Autowired
	private CartItemIdDao cartItemIdDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@GetMapping("/customer/addtocart")
 	public String addToCart(Principal principal, HttpServletRequest request) {
 
 		int productId = Integer.parseInt(request.getParameter("productId"));
		int quantity = Integer.parseInt(request.getParameter("numberOfProducts"));
		int unitprice = productDao.getProduct(productId).getPrice();
		Product product = productDao.getProduct(productId);
		customer=customerDao.getCustomerByEmail(principal.getName());
 		if (checkAvailabilityOfProducts(productId, quantity) == true) {
 			
			cart = cartDao.getCart(customer.getCustomerId());
			
			if (cart == null) {
				
				cart = new Cart();
				cartItems = new CartItems();
				List<CartItemId> cartItemIdList = new ArrayList<CartItemId>();
				List<CartItems> cartItemsList = new ArrayList<CartItems>();
				List<NumberOfProducts> noOfProductsList = numberOfProductsDao.getNumberOfProducts(productId);
 				for (int i = 0; i < quantity; i++) {
					
					cartItemId = new CartItemId();
					numberOfProducts = new NumberOfProducts();
					numberOfProducts = noOfProductsList.get(i);
					numberOfProducts.setSold(true);
 					cartItemId.setNumberOfProducts(numberOfProducts);
 					cartItemId.setCartItems(cartItems);
 					cartItemIdList.add(cartItemId);
 				}
 				cartItems.setUnitprice(unitprice);
 				cartItems.setTotalprice(unitprice * quantity);
 				cartItems.setQuantity(quantity);
 				cartItems.setCartItemIds(cartItemIdList);
 				cartItems.setCart(cart);
 				cartItemsList.add(cartItems);
 				cart.setCartItems(cartItemsList);
 				cart.setCustomer(customer);
 				cart.setNetPrice(quantity * unitprice);
				cart.setNumOfItems(quantity);
				cartDao.addCart(cart);
 				
				return "redirect:/customer/cart";
 			} else {
  				cartItems = checkIfProductAlreadyExists(productId, cart);
 
 				if (cartItems != null) {
 
 					List<CartItemId> cartItemIdsList = new ArrayList<CartItemId>();
 					List<CartItems> cartItemsList = new ArrayList<CartItems>();
					cartItemsList = cart.getCartItems();
					int position = cartItemsList.indexOf(cartItems);
					List<NumberOfProducts> noOfProductsList = numberOfProductsDao.getNumberOfProducts(productId);
					cartItemIdsList = cartItemIdDao.getAllCartItemId(cartItems.getCartItemId());
					
					for (int i = 0; i < quantity; i++) {
						
						cartItemId = new CartItemId();
						numberOfProducts = new NumberOfProducts();
						numberOfProducts = noOfProductsList.get(i);
						numberOfProducts.setSold(true);
 						cartItemId.setNumberOfProducts(numberOfProducts);
 						cartItemId.setCartItems(cartItems);
 						cartItemIdsList.add(cartItemId);
 					}
 					cartItems.setCartItemIds(cartItemIdsList);
 					cartItemsList.add(position, cartItems);
 					cart.setCartItems(cartItemsList);
 					cart.setNetPrice((quantity * unitprice) + cart.getNetPrice());
					cart.setNumOfItems(quantity + cart.getNumOfItems());
					cartDao.updateCart(cart);
 				
					return "redirect:/customer/cart";
				} else {
 					cartItems = new CartItems();
					List<CartItemId> cartItemIdsList = new ArrayList<CartItemId>();
					List<CartItems> cartItemsList = new ArrayList<CartItems>();
					List<NumberOfProducts> numberOfProductsList = numberOfProductsDao.getNumberOfProducts(productId);
					for (int i = 0; i < quantity; i++) {
						
						cartItemId = new CartItemId();
						numberOfProducts = new NumberOfProducts();
						numberOfProducts = numberOfProductsList.get(i);
						numberOfProducts.setSold(true);
 						cartItemId.setNumberOfProducts(numberOfProducts);
 						cartItemId.setCartItems(cartItems);
 						cartItemIdsList.add(cartItemId);
 					}
 					cartItems.setUnitprice(unitprice);
 					cartItems.setTotalprice(unitprice * quantity);
 					cartItems.setQuantity(quantity);
 					cartItems.setCartItemIds(cartItemIdsList);
 					cartItems.setCart(cart);
 					cartItemsList.add(cartItems);	
 					cart.setCartItems(cartItemsList);
					cart.setNetPrice((quantity * unitprice) + cart.getNetPrice());
					cart.setNumOfItems(quantity + cart.getNumOfItems());
					cartDao.updateCart(cart);
					
					return "redirect:/customer/cart";
				}
 			}
 		} else {
 
			return  "redirect:/customer/customerpage";
		}
 	}
 	public CartItems checkIfProductAlreadyExists(int productId, Cart cart) {
		
		List<CartItems> cartItemsList = cart.getCartItems();
		
		for (CartItems items : cartItemsList) {
			if (items.getCartItemIds().get(0).getNumberOfProducts().getProduct().getProductId() == productId) {
				return items;
			}
		}
		return null;
	}
			
 	public boolean checkAvailabilityOfProducts(int productId, int quantity) {
		
		if (numberOfProductsDao.getNumberOfProducts(productId).size() >= quantity) {
			return true;
		} else {
			return false;
		}
	}
	
	@GetMapping("/customer/cart")
	public String displayCart(Principal principal,Model model)
	{
		Customer customer = customerDao.getCustomerByEmail(principal.getName());
		Cart cart = cartDao.getCart(customer.getCustomerId());

		model.addAttribute("cart", cart);

		return "cart";
	}
}
