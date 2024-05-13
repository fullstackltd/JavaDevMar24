package root.oop.fastfood;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private int orderNo;
	private LocalDate orderDate;
	private Customer customer;
	private List<OrderLine> orderaLines;
	
	public Order(int orderNo, LocalDate orderDate, Customer customer) {
		super();
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.customer = customer;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public List<OrderLine> getOrderaLines() {
		return orderaLines;
	}
	public void setOrderaLines(List<OrderLine> orderaLines) {
		this.orderaLines = orderaLines;
	}
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderDate=" + orderDate + ", customer=" + customer + ", orderaLines="
				+ orderaLines + "]";
	}
	
	
	public void printOrder() {
		System.out.println(this.orderNo);
		System.out.println(this.orderDate);
		System.out.println(this.getCustomer().getNameString()+" | "
					+this.getCustomer().getPhoneString());
		
		System.out.println(String.format("%-7s %10s %10s %10s", "Item", "Quantity", "UPrice", "Total"));
		System.out.println("-----------------------------------------");
		
		
		for (OrderLine orderLine : orderaLines) {
			String descString = "";
			if(orderLine.getItem() instanceof Burger) {
				Burger b = (Burger)orderLine.getItem();
				descString = b.getTopping();
			}else if(orderLine.getItem() instanceof Mojo) {
				Mojo mojo = (Mojo)orderLine.getItem();
				descString = mojo.getFlavor();
			}
			System.out.println(String.format("%-7s %10d %10.2f %10.2f"
					,orderLine.getItem().getNameString()+"("+descString+")"
					,orderLine.getQuantity(), orderLine.getUnitPrice()
					,orderLine.getQuantity() * orderLine.getUnitPrice()
			));
		}
		
		
	}
	
}
