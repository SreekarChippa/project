package application.jconfig.dao.impl;

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

}
