package application.jconfig.model.product;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import application.jconfig.model.Product;

@Entity
@Component
public class Television extends Product {
	private int screenSize;
	private String screenType;
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public String getScreenType() {
		return screenType;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	@Override
	public String toString() {
		return "Television [screenSize=" + screenSize + ", screenType=" + screenType + "]";
	}
	

}
