package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private int quantity;
	private List<Product> orderItens = new ArrayList<>();
	
	public OrderItem(int quantity, List<Product> orderItens) {	
		this.quantity = quantity;
		this.orderItens = orderItens;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<Product> getOrderItens() {
		return orderItens;
	}
	public void setOrderItens(List<Product> orderItens) {
		this.orderItens = orderItens;
	}

	
}
