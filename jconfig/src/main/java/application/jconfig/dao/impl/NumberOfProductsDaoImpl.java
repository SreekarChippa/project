package application.jconfig.dao.impl;

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

}
