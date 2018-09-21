package application.jconfig.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	private String status;
	
	@OneToMany
	private List<NumberOfProducts> numberOfProducts;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private List<OrderedItems> orderedItems;
	
	public List<OrderedItems> getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(List<OrderedItems> orderedItems) {
		this.orderedItems = orderedItems;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<NumberOfProducts> getNumberOfProducts() {
		return numberOfProducts;
	}
	public void setNumberOfProducts(List<NumberOfProducts> numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", status=" + status + ", numberOfProducts=" + numberOfProducts
				+ ", customer=" + customer + ", orderedItems=" + orderedItems + "]";
	}
	

	
}
