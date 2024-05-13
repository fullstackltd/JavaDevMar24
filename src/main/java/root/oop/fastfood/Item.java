package root.oop.fastfood;

public abstract class Item {

	private int id;
	private String nameString;
	private double unitPrice;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Item(int id, String nameString, double unitPrice) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", nameString=" + nameString + ", unitPrice=" + unitPrice + "]";
	}
	
	
}
