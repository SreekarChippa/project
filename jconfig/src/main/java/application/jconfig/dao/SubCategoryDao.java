package application.jconfig.dao;

import java.util.List;

import application.jconfig.model.SubCategory;

public interface SubCategoryDao {
	public SubCategory getSubCategory(int subCategoryId);
	public List<SubCategory> getsubCategories(int categoryId);
	public List<SubCategory> getAllSubCategories();
	public List<SubCategory> getElectronics();
	public List<SubCategory> getMen();
	public List<SubCategory> getWomen();
	public List<SubCategory> getKids();
	public List<SubCategory> getHomeAppliances();
}
