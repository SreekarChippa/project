package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.TelevisionDao;
import application.jconfig.model.product.Television;

@Transactional
@Component
public class TelevisionDaoImpl implements TelevisionDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addTelevision(Television television) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(television);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean updateTelevision(Television television) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(television);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}

	}	
		
	public boolean deleteTelevision(Television television) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(television);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

		
}
