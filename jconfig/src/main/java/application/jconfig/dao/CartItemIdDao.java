package application.jconfig.dao;

import java.util.List;

import application.jconfig.model.CartItemId;

public interface CartItemIdDao {
	public boolean addCartItemId(CartItemId cartItemId);
	public boolean deleteCartItemId(CartItemId cartItemId);
	public boolean updateCartItemId(CartItemId cartItemId);
	
	public List<CartItemId> getAllCartItemId(int cartItemId);
	public boolean deleteAllCartItemId(int cartItemId);
}
