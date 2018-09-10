package application.jconfig.dao;

import application.jconfig.model.Customer;

public interface CustomerDao {
	
	public boolean addCustomer(Customer customer);
	public Customer loginCustomer(String email,String password);
	public boolean deleteCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public Customer getCustomerById(int customerId);
	public Customer getCustomerByEmail(String email);
}
