package application.jconfig.dao;

import application.jconfig.model.VendorAddress;

public interface VendorAddressDao {

	public boolean addAddress(VendorAddress vendorAddress);
	public boolean deleteAddress(VendorAddress vendorAddress);
	public  VendorAddress updateAddress(VendorAddress vendorAddresss);
	public VendorAddress getAddress(int vendorAddressId);
}
