package application.jconfig.dao;

import application.jconfig.model.Vendor;

public interface VendorDao {
	
	public boolean addVendor(Vendor vendor);
	public boolean updateVendor(Vendor vendor);
	public boolean deleteVendor(Vendor vendor);
	public Vendor getVendorById(int vendorId);
	public Vendor getVendorByEmail(String email);
	public Vendor login(String email,String password);
	public boolean registerVendor(Vendor vendor);
}
