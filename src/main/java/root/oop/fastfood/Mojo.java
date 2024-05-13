package root.oop.fastfood;

public class Mojo extends Drinks {

	String flavor;

	public Mojo(int id, String nameString, double unitPrice, int ml, String flavor) {
		super(id, nameString, unitPrice, ml);
		this.flavor = flavor;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public String toString() {
		return "Mojo [flavor=" + flavor + ", ml=" + ml + ", getMl()=" + getMl() + ", getId()=" + getId()
				+ ", getNameString()=" + getNameString() + ", getUnitPrice()=" + getUnitPrice() + "]";
	}
	
	
}
