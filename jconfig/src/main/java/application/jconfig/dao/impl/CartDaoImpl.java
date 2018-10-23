package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.CartDao;
import application.jconfig.model.Cart;
import application.jconfig.model.Customer;

@Component
@Transactional
public class CartDaoImpl implements CartDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteCart(Cart cart) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(cart);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public Cart getCartByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Cart getCart(int customerId) {
		// TODO Auto-generated method stub
		try {
			return (Cart) sessionFactory.getCurrentSession().createQuery("from Cart where customer_customerId=:id")
					.setParameter("id", customerId).getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public boolean deleteCartByCustomerId(int cartId) {
		// TODO Auto-generated method stub
		try {
			Query<Cart> query=sessionFactory.getCurrentSession().createNamedQuery("delete from Cart where cartId=:id", Cart.class);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
		
	}
	

}
