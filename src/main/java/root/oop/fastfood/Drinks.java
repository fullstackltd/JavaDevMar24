package root.oop.fastfood;

public abstract class Drinks extends Item {

	int ml;

	public Drinks(int id, String nameString, double unitPrice, int ml) {
		super(id, nameString, unitPrice);
		this.ml = ml;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

	@Override
	public String toString() {
		return "Drinks [ml=" + ml + ", getId()=" + getId() + ", getNameString()=" + getNameString()
				+ ", getUnitPrice()=" + getUnitPrice() + "]";
	}
	
	
	
}
