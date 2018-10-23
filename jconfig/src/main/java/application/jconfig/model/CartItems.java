package application.jconfig.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CartItems {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartItemsId;
	private int unitprice;
	private int quantity;
	private int totalprice;
	
	@ManyToOne
	private Cart cart;
	
	@OneToMany(mappedBy="cartItems",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<CartItemId> cartItemIds;

	public int getCartItemId() {
		return cartItemsId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemsId = cartItemId;
	}

	public int getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public List<CartItemId> getCartItemIds() {
		return cartItemIds;
	}

	public void setCartItemIds(List<CartItemId> cartItemIds) {
		this.cartItemIds = cartItemIds;
	}

	
	
}
