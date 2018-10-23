package application.jconfig.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.CartItemsDao;
import application.jconfig.model.CartItems;

@Transactional
@Component
public class CartItemsDaoImpl implements CartItemsDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addCartItems(CartItems cartItems) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(cartItems);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteCartItems(CartItems cartItems) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(cartItems);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean updateCartItems(CartItems cartItems) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(cartItems);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public CartItems getCartItems(int cartItemsId) {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession()
					.createQuery("from CartItems where cartItemsId=:id", CartItems.class).setParameter("id", cartItemsId)
					.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public boolean deleteCartItems(int cartItemsId) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().createQuery("delete from CartItems where cartItemsId=:id").setParameter("id", cartItemsId);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public List<CartItems> getAllCartItemsByCartId(int cartId) {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession().createQuery("from CartItems where cart_cartId=:id", CartItems.class).setParameter("id", cartId)
					.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public CartItems getCartItemsByCartId(int cartId) {
		// TODO Auto-generated method stub
		try {
			return (CartItems) sessionFactory.getCurrentSession().createQuery("from CartItems where cart_cart_id=:id")
					.setParameter("id", cartId).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

}
