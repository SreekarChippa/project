package application.jconfig.dao;

import application.jconfig.model.CartItems;

public interface CartItemsDao {
	public boolean addCartItems(CartItems cartItems);
	public boolean deleteCartItems(CartItems cartItems);
	public boolean updateCartItems(CartItems cartItems);

}
