package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



import application.jconfig.dao.UserDao;
import application.jconfig.model.User;

@Component
@Transactional
public class UserDaoImpl implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().save(user);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().update(user);
		return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().delete(user);	
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		try {
		return sessionFactory.getCurrentSession().get(User.class, userId);
		}catch (Exception e) {
			// TODO: handle exception
		return null;
		}
		
	}

	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		try {
			Query<User> query=sessionFactory.getCurrentSession().createQuery("from User where email=:email", User.class);
			query.setParameter("email", email);
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	public User login(String email, String password) {
		// TODO Auto-generated method stub
		try {
			Query<User> query=sessionFactory.getCurrentSession().createQuery("from User where email=:email and password=:password", User.class);
			query.setParameter("email", email);
			query.setParameter("password", password);
			return query.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	public List<User> getVendorDetails() {
		// TODO Auto-generated method stub
		try {
			Query<User> query=sessionFactory.getCurrentSession().createQuery("from User where role='vendor", User.class);
			return query.getResultList();
		}
		return null;
	}

	
}
