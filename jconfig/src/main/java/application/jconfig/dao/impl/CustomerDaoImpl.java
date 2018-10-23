package application.jconfig.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.CustomerDao;
import application.jconfig.model.Customer;

@Component
@Transactional
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(customer);
			return true;
			}catch(Exception e) {
				return false;
			}
	}

	public boolean deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().delete(customer);
			return true;
			}catch(Exception e) {
				return false;
			}
	}

	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(customer);
			return true;
			}catch(Exception e) {
				return false;
			}
	}
	
	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		try {
		return sessionFactory.getCurrentSession().get(Customer.class, customerId);
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		try {
		Query<Customer> query=sessionFactory.getCurrentSession().createQuery("from Customer where email=:email", Customer.class);
		query.setParameter("email", email);
		return query.getSingleResult();
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	

	public Customer loginCustomer(String email, String password) {
		// TODO Auto-generated method stub
		Query<Customer> query=sessionFactory.getCurrentSession().createQuery("from Customer where email=:email and password=:password", Customer.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		return query.getSingleResult();
	}

	public boolean registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(customer);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}

	@Override
	public List<Customer> getAllCustomerDetails() {
		// TODO Auto-generated method stub
		try {
			Query<Customer> query = sessionFactory.getCurrentSession().createQuery("from Customer", Customer.class);
			return query.getResultList();
		} catch (Exception e) {
			
			return null;
		}
	}


}
