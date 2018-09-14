package application.jconfig.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
@Inheritance(strategy=InheritanceType.JOINED)
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;

	private String brand;
	private String model;
	private int warranty;
	private int price;
	private int numOfProducts;
	
	@Transient
	private MultipartFile image;
	
	@ManyToOne
	private Vendor vendor;
	
	@ManyToOne
	private SubCategory subCategory;
	
	@OneToMany(mappedBy="product", cascade=CascadeType.ALL)
	private List<NumberOfProducts> numberOfProducts;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumOfProducts() {
		return numOfProducts;
	}

	public void setNumOfProducts(int numOfProducts) {
		this.numOfProducts = numOfProducts;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public List<NumberOfProducts> getNumberOfProducts() {
		return numberOfProducts;
	}

	public void setNumberOfProducts(List<NumberOfProducts> numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", brand=" + brand + ", model=" + model + ", warranty=" + warranty
				+ ", price=" + price + ", numOfProducts=" + numOfProducts + ", image=" + image + ", vendor=" + vendor
				+ ", subCategory=" + subCategory + ", numberOfProducts=" + numberOfProducts + "]";
	}
	
	
}
