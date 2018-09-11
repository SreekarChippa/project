package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;

import application.jconfig.dao.AdminDao;
import application.jconfig.model.Admin;

public class AdminDaoImpl implements AdminDao {
	
	private SessionFactory sessionFactory;

	public boolean addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(admin);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
