package application.jconfig.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import application.jconfig.dao.VendorAddressDao;
import application.jconfig.model.VendorAddress;

public class VendorAddressDaoimpl implements VendorAddressDao{
	
	@Autowired
    private SessionFactory sessionFactory;

	public boolean addAddress(VendorAddress vendorAddress) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(vendorAddress);
		   	return true;
			}
		catch (Exception e) {
				return false;
				}
		
	}

	public boolean deleteAddress(VendorAddress vendorAddress) {
		// TODO Auto-generated method stub
		try {
		    sessionFactory.getCurrentSession().delete(vendorAddress);
		    	return true;
			} catch (Exception e) {
				return false;
				}
	}

	public VendorAddress updateAddress(VendorAddress vendorAddress) {
		// TODO Auto-generated method stub
		try {
		       sessionFactory.getCurrentSession().update(vendorAddress);
		       return vendorAddress;
		   
	         } catch (Exception e) {
		        return null;
	         }
	}

	public VendorAddress getAddress(int vendorAddressId) {
		// TODO Auto-generated method stub
		try {
			  return sessionFactory.getCurrentSession().get(VendorAddress.class, vendorAddressId);
		     } catch (Exception e) {
			   return null;
		    }
		}


}
