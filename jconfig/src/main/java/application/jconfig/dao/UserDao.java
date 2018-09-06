package application.jconfig.dao;

import java.util.List;

import application.jconfig.model.User;

public interface UserDao {
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public User getUserById(int userId);
	public User getUserByEmail(String email);
	public User login(String email,String password);
	public List<User> getVendorDetails();
	

}
