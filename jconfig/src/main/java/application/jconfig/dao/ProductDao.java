package application.jconfig.dao;

import java.util.List;

import application.jconfig.model.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public boolean deleteProduct(Product product);
	public boolean updateProduct(Product product);
	public int getSubCategoryId(int productId);
	public List<Product> getAllProducts(int vendorId);
	List<Product> getProducts(int subCategoryId);
	public Product getProduct(int productId);

}
