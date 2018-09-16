package application.jconfig.dao;

import application.jconfig.model.Admin;

public interface AdminDao {
	public boolean addAdmin(Admin admin);
	public boolean deleteAdmin(Admin admin);
	public boolean updateAdmin(Admin admin);
	public Admin login(String email,String password);
}
