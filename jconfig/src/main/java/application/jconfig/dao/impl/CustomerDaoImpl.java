package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
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
		return null;
	}

	public Customer getCustomerByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	

	public Customer loginCustomer(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}


}
