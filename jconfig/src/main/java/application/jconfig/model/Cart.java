package application.jconfig.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartId;
	private int numOfItems;
	private int netPrice;
	
	@OneToMany(mappedBy="cart",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<CartItems> cartItems;
	
	@OneToOne
	private Customer customer;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getNumOfItems() {
		return numOfItems;
	}

	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}

	public List<CartItems> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItems> cartItems) {
		this.cartItems = cartItems;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", numOfItems=" + numOfItems + ", netPrice=" + netPrice + ", cartItems="
				+ cartItems + ", customer=" + customer + "]";
	}
	
	
	

}
