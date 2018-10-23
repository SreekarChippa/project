package application.jconfig.dao;

import java.util.List;

import application.jconfig.model.NumberOfProducts;

public interface NumberOfProductsDao {
	public boolean addNumberOfProducts(NumberOfProducts numberOfProducts);
	public List<NumberOfProducts> getNumberOfProducts(int productId);
	public NumberOfProducts getNumberOfProductsByNumberOfProductsId(int itemNo);
}
