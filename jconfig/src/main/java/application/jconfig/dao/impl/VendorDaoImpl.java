package application.jconfig.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;



import application.jconfig.dao.VendorDao;
import application.jconfig.model.Product;
import application.jconfig.model.Vendor;

@Component
@Transactional
public class VendorDaoImpl implements VendorDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addVendor(Vendor vendor) {
		try
		{
		sessionFactory.getCurrentSession().save(vendor);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean updateVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().update(vendor);
			return true;
		}
		catch(Exception ex)
		{
			return false;
		}
		
	}

	public boolean deleteVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().delete(vendor);
		return true;
		}
		catch(Exception exception)
		{
		return false;	
		}
		
	}

	public Vendor getVendorById(int vendorId) {
		// TODO Auto-generated method stub
		try {
	 	return sessionFactory.getCurrentSession().get(Vendor.class, vendorId);
		}catch (HibernateException e) {
			// TODO: handle exception
			return null;
		}	
	}


	public Vendor login(String email, String password) {
		// TODO Auto-generated method stub
		try {
		Query<Vendor> query=sessionFactory.getCurrentSession().createQuery("from Vendor where email=:email and password=:password",Vendor.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		return query.getSingleResult();
		}catch (Exception e) {
			// TODO: handle exception
		return null;
		}
	}

	public Vendor getVendorByEmail(String email) {
		// TODO Auto-generated method stub
		try {
		Query<Vendor> query=sessionFactory.getCurrentSession().createQuery("from Vendor where email=:email", Vendor.class);
		query.setParameter("email", email);
		return query.getSingleResult();
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	public boolean registerVendor(Vendor vendor) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(vendor);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public List<Vendor> getAllVendorDetails() {
		// TODO Auto-generated method stub
		try {
			Query<Vendor> query=sessionFactory.getCurrentSession().createQuery("from Vendor ",Vendor.class);
			return query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Product> getProducts(int VendorId) {
		// TODO Auto-generated method stub
		try {
			Query<Product> query=sessionFactory.getCurrentSession().createQuery("form Product where vendor_vendorId=:id", Product.class);
			return query.getResultList();
		} catch (Exception e) {
		e.printStackTrace();
		return null;
		}
	}
	
}
