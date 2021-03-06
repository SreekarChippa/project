package application.jconfig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class NumberOfProducts {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemNo;
	private boolean sold;
	
	@ManyToOne
	private Product product;
	
	@OneToOne
	private CartItemId cartItemId;

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public boolean isSold() {
		return sold;
	}

	public void setSold(boolean sold) {
		this.sold = sold;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "NumberOfProducts [itemNo=" + itemNo + ", sold=" + sold + ", product=" + product + "]";
	}
	
	
}
