package root.oop.fastfood;

public class Burger extends Item {
	
	String topping;

	public Burger(int id, String nameString, double unitPrice, String topping) {
		super(id, nameString, unitPrice);
		this.topping = topping;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	@Override
	public String toString() {
		return "Burger [topping=" + topping + ", getId()=" + getId() + ", getNameString()=" + getNameString()
				+ ", getUnitPrice()=" + getUnitPrice() + "]";
	}
}
