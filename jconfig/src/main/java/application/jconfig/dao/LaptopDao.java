package application.jconfig.dao;

import application.jconfig.model.product.Laptop;

public interface LaptopDao {
	public boolean addLaptop(Laptop laptop);
	public boolean deleteLaptop(Laptop laptop);
	public boolean updateLaptop(Laptop laptop);
	public Laptop getLaptopDetails(int productId);
}
