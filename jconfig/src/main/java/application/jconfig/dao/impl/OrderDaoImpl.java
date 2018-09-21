package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.OrderDao;
import application.jconfig.model.Order;

@Transactional
@Component
public class OrderDaoImpl implements OrderDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addOrder(Order order) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(order);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteOrder(Order order) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(order);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(order);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

}
