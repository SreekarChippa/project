package application.jconfig.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.SubCategoryDao;
import application.jconfig.model.SubCategory;

@Component
@Transactional
public class SubCategoryDaoImpl implements SubCategoryDao{

	@Autowired
	private SessionFactory sessionFactory;

	public SubCategory getSubCategory(int subCategoryId) {
		// TODO Auto-generated method stub
		try {
		return sessionFactory.getCurrentSession().get(SubCategory.class, subCategoryId);
	
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	public List<SubCategory> getsubCategories(int categoryId) {
		// TODO Auto-generated method stub
		try {
		Query<SubCategory> query=sessionFactory.getCurrentSession().createQuery("from SubCategory where category_categoryId=:id", SubCategory.class);
		query.setParameter("id", categoryId);
		return query.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	public List<SubCategory> getAllSubCategories() {
		// TODO Auto-generated method stub
		try {
			return sessionFactory.getCurrentSession().createCriteria(SubCategory.class).list();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	public List<SubCategory> getElectronics() {
		// TODO Auto-generated method stub
		try {
			Query<SubCategory> query=sessionFactory.getCurrentSession().createQuery("from SubCategory where category_categoryId=1", SubCategory.class);
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	public List<SubCategory> getMen() {
		// TODO Auto-generated method stub
		try {
			Query<SubCategory> query=sessionFactory.getCurrentSession().createQuery("from subCategory where category_categoryId=2", SubCategory.class);
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List<SubCategory> getWomen() {
		// TODO Auto-generated method stub
		try {
			Query<SubCategory> query=sessionFactory.getCurrentSession().createQuery("from subCategory where category_categoryId=3", SubCategory.class);
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List<SubCategory> getKids() {
		// TODO Auto-generated method stub
		try {
			Query<SubCategory> query=sessionFactory.getCurrentSession().createQuery("from subCategory where category_categoryId=4", SubCategory.class);
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public List<SubCategory> getHomeAppliances() {
		// TODO Auto-generated method stub
		try {
			Query<SubCategory> query=sessionFactory.getCurrentSession().createQuery("from subCategory where category_categoryId=5", SubCategory.class);
			return query.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	
}
