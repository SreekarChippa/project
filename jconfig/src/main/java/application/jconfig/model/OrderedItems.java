package application.jconfig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class OrderedItems {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderedItemId;
	
	private int quantity;
	
	private int unitprice;
	
	private int totalprice;
	
	@ManyToOne
	private Order order;

	public int getOrderedItemId() {
		return orderedItemId;
	}

	public void setOrderedItemId(int orderedItemId) {
		this.orderedItemId = orderedItemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(int unitprice) {
		this.unitprice = unitprice;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderedItems [orderedItemId=" + orderedItemId + ", quantity=" + quantity + ", unitprice=" + unitprice
				+ ", totalprice=" + totalprice + ", order=" + order + "]";
	}

	
}
