package application.jconfig.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.NumberOfProductsDao;
import application.jconfig.model.NumberOfProducts;

@Transactional
@Component
public class NumberOfProductsDaoImpl implements NumberOfProductsDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean addNumberOfProducts(NumberOfProducts numberOfProducts) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(numberOfProducts);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public List<NumberOfProducts> getNumberOfProducts(int productId) {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession().createQuery("from NumberOfProducts where product_productId=:id and sold=false")
					.setParameter("id", productId).getResultList();
		} catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public NumberOfProducts getNumberOfProductsByNumberOfProductsId(int itemNo) {
		// TODO Auto-generated method stub
		try {
			return (NumberOfProducts) sessionFactory.getCurrentSession().createQuery("from NumberOfProducts where itemNo=:id").setParameter("id", itemNo)
					.getSingleResult();
		} catch (HibernateException e) {
			return null;
		}
	}

}
