package application.jconfig.dao;

import java.util.List;

import application.jconfig.model.CartItems;

public interface CartItemsDao {
	public boolean addCartItems(CartItems cartItems);
	public boolean deleteCartItems(CartItems cartItems);
	public boolean updateCartItems(CartItems cartItems);
	
	public CartItems getCartItems(int cartItemsId);
	public boolean deleteCartItems(int cartItemsId);
	
	public List<CartItems> getAllCartItemsByCartId(int cartId);
	public CartItems getCartItemsByCartId(int cartId);
	
}
