package application.jconfig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import org.springframework.stereotype.Component;

@Entity
@Component
public class CartItemId {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartItemId;
	
	@ManyToOne
	private CartItems cartItems; 
	
	@OneToOne
	private NumberOfProducts numberOfProducts;

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public CartItems getCartItems() {
		return cartItems;
	}

	public void setCartItems(CartItems cartItems) {
		this.cartItems = cartItems;
	}

	public NumberOfProducts getNumberOfProducts() {
		return numberOfProducts;
	}

	public void setNumberOfProducts(NumberOfProducts numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}

	@Override
	public String toString() {
		return "CartItemId [cartItemId=" + cartItemId + ", cartItems=" + cartItems + ", numberOfProducts="
				+ numberOfProducts + "]";
	}
	
	
}
