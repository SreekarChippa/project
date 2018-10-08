/*package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.OrderedItemsDao;
import application.jconfig.model.OrderedItems;

@Component
@Transactional
public class OrderedItemsDaoImpl implements OrderedItemsDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addOrderedItems(OrderedItems orderedItems) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(orderedItems);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		return false;
		}
	}

	public boolean deleteOrderedItems(OrderedItems orderedItems) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(orderedItems);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		return false;
		}
	}

	public boolean updateOrderedItems(OrderedItems orderedItems) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(orderedItems);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		return false;
		}
	}

}*/