package application.jconfig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class VendorAddress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vendorAddressId;
	
	private String houseNumber;
	private String street;
	private String city;
	private String state;
	
	@ManyToOne
	private Vendor vendor;
	
	public int getVendorId() {
		return vendorAddressId;
	}
	public void setVendorId(int vendorId) {
		this.vendorAddressId = vendorId;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "VendorAddress [vendorId=" + vendorAddressId + ", houseNumber=" + houseNumber + ", street=" + street + ", city="
				+ city + ", state=" + state + "]";
	}
	
	
}
