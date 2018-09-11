package application.jconfig.dao;

import java.util.List;

import application.jconfig.model.Category;

public interface CategoryDao {
	public boolean addCategory(Category category);
	public List<Category> getCategories();
	public Category getCategoryById(int categoryId); 
}
