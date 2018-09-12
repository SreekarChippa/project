package application.jconfig.dao;

import java.util.List;

import application.jconfig.model.Product;
import application.jconfig.model.Vendor;

public interface VendorDao {
	
	public boolean addVendor(Vendor vendor);
	public boolean updateVendor(Vendor vendor);
	public boolean deleteVendor(Vendor vendor);
	public Vendor getVendorById(int vendorId);
	public Vendor getVendorByEmail(String email);
	public Vendor login(String email,String password);
	public boolean registerVendor(Vendor vendor);
	public List<Vendor> getAllVendorDetails();
	public List<Product> getProducts(int VendorId);
}
