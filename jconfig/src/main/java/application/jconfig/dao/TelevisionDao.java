package application.jconfig.dao;

import application.jconfig.model.product.Television;

public interface TelevisionDao {
	public boolean addTelevision(Television television);
	public boolean updateTelevision(Television television);
	public boolean deleteTelevision(Television television);
}
