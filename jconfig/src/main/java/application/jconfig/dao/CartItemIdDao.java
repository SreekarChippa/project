package application.jconfig.dao;

import application.jconfig.model.CartItemId;

public interface CartItemIdDao {
	public boolean addCartItemId(CartItemId cartItemId);
	public boolean deleteCartItemId(CartItemId cartItemId);
	public boolean updateCartItemId(CartItemId cartItemId);
}
