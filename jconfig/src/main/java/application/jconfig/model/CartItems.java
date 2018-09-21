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
public class CartItems {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemId;
	private int unitprice;
	private int quantity;
	private int totalprice;
	
	@ManyToOne
	private Cart cart;
	
	@OneToOne
	private Product product;
	
	@OneToOne
	private CartItemId cartItemId;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CartItemId getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(CartItemId cartItemId) {
		this.cartItemId = cartItemId;
	}

	@Override
	public String toString() {
		return "CartItems [itemId=" + itemId + ", unitprice=" + unitprice + ", quantity=" + quantity + ", totalprice="
				+ totalprice + ", cart=" + cart + ", product=" + product + ", cartItemId=" + cartItemId + "]";
	}
	
	
}
