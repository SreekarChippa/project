package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.AdminDao;
import application.jconfig.model.Admin;
@Transactional
@Component
public class AdminDaoImpl implements AdminDao {
	
	@Autowired
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
		try {
			sessionFactory.getCurrentSession().delete(admin);
				return true;
			}
			catch(Exception ex)
			{
				return false;
			}
	}

	public boolean updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(admin);
				return true;
			}
			catch(Exception ex)
			{
				return false;
			}
	}

	public Admin login(String email, String password) {
		// TODO Auto-generated method stub
		try {
			Query<Admin> query=sessionFactory.getCurrentSession().createQuery("from AdminDetails where email=:email and password=:password", Admin.class);
			query.setParameter("email", email);
			query.setParameter("password", password);
			return query.getSingleResult();
			}catch (Exception e) {
				// TODO: handle exception
			return null;
			}
	}

	@Override
	public Admin getAdminByEmail(String email) {
		// TODO Auto-generated method stub
		try {
			Query<Admin> query=sessionFactory.getCurrentSession().createQuery("from adminetails where email=:email", Admin.class);
			query.setParameter("email", email);
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
	
}
