package application.jconfig.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.ProductDao;
import application.jconfig.model.Product;
import application.jconfig.model.SubCategory;
import application.jconfig.model.Vendor;

@Component
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().save(product);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().delete(product);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public int getSubCategoryId(int productId) {
		// TODO Auto-generated method stub
		try {
			Query<Product> query = sessionFactory.getCurrentSession().createQuery("from Product where productId=:id", Product.class);
			query.setParameter("id", productId);
			Product product=query.getSingleResult();
			return product.getSubCategory().getSubCategoryId();	
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
			
	}

	public List<Product> getAllProducts(int vendorId) {
		// TODO Auto-generated method stub
		try {
			Query<Product> query=sessionFactory.getCurrentSession().createQuery("from Product where vendor_vendorId=:id", Product.class);
			query.setParameter("id", vendorId);
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public List<Product> getProducts(int subCategoryId) {
		// TODO Auto-generated method stub
		try {
			Query<Product> query=sessionFactory.getCurrentSession().createQuery("from Product where subCategory_subCategoryId=:id", Product.class);
			query.setParameter("id", subCategoryId);
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	

}
