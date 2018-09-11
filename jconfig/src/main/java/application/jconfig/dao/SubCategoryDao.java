package application.jconfig.dao;

import java.util.List;

import application.jconfig.model.SubCategory;

public interface SubCategoryDao {
	public SubCategory getSubCategory(int subCategoryId);
	public List<SubCategory> getsubCategories(int categoryId);
}
