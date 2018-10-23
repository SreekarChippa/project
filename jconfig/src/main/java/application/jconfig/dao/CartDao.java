package application.jconfig.dao;

import application.jconfig.model.Cart;

public interface CartDao {
	public boolean addCart(Cart cart);
	public boolean deleteCart(Cart cart);
	public boolean updateCart(Cart cart);
	public Cart getCartByCustomerId(int customerId);
	public Cart getCart(int customerId);
	public boolean deleteCartByCustomerId(int cartId);
}
