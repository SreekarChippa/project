package application.jconfig.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import application.jconfig.dao.CategoryDao;
import application.jconfig.model.Category;

@Component
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		try {
		sessionFactory.getCurrentSession().save(category);
			return true;
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}

	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		Query<Category> query=sessionFactory.getCurrentSession().createQuery("from Category", Category.class);
		return query.getResultList();
	}

	public Category getCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		try {
		return sessionFactory.getCurrentSession().get(Category.class, categoryId);
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

}
