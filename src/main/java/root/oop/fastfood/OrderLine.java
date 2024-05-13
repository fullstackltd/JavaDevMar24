package root.oop.fastfood;

public class OrderLine {
	private Item item;
	private int quantity;
	private double unitPrice;
	public OrderLine(Item item, int quantity, double unitPrice) {
		this.item = item;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	@Override
	public String toString() {
		return "OrderLine [item=" + item + ", quantity=" + quantity + ", unitPrice=" + unitPrice
				+ "]";
	}
	
	
	
}
