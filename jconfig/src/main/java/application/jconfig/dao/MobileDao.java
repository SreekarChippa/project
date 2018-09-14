package application.jconfig.dao;

import application.jconfig.model.product.Mobile;

public interface MobileDao {
	public boolean addMobile(Mobile mobile);
	public boolean deleteMobile(Mobile mobile);
	public boolean updateMobile(Mobile mobile);
	public Mobile getMobileDetails(int productId);
}
