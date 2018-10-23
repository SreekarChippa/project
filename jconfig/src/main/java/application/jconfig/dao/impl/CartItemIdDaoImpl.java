package application.jconfig.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.CartItemIdDao;
import application.jconfig.model.CartItemId;

@Component
@Transactional
public class CartItemIdDaoImpl implements CartItemIdDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addCartItemId(CartItemId cartItemId) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(cartItemId);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteCartItemId(CartItemId cartItemId) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(cartItemId);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean updateCartItemId(CartItemId cartItemId) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(cartItemId);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public List<CartItemId> getAllCartItemId(int cartItemId) {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession().createQuery("from CartItemId where cartItems_cartItemId=:id", CartItemId.class)
					.setParameter("id", cartItemId).getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public boolean deleteAllCartItemId(int cartItemId) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().createQuery("delete from CartItemId where cartItems_cartItemId=:id").setParameter("id", cartItemId);
	return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
