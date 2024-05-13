package root.oop.fastfood;

public class Cocacola extends Drinks {

	String bottleType;

	public Cocacola(int id, String nameString, double unitPrice, int ml, String bottleType) {
		super(id, nameString, unitPrice, ml);
		this.bottleType = bottleType;
	}

	public String getBottleType() {
		return bottleType;
	}

	public void setBottleType(String bottleType) {
		this.bottleType = bottleType;
	}

	@Override
	public String toString() {
		return "Cocacola [bottleType=" + bottleType + ", ml=" + ml + ", getMl()=" + getMl() + ", getId()=" + getId()
				+ ", getNameString()=" + getNameString() + ", getUnitPrice()=" + getUnitPrice() + "]";
	}
	
	
}
