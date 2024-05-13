package root.oop.fastfood;

public class Customer {

	private String nameString;
	private String phoneString;
	public Customer(String nameString, String phoneString) {
		super();
		this.nameString = nameString;
		this.phoneString = phoneString;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getPhoneString() {
		return phoneString;
	}
	public void setPhoneString(String phoneString) {
		this.phoneString = phoneString;
	}
	@Override
	public String toString() {
		return "Customer [nameString=" + nameString + ", phoneString=" + phoneString + "]";
	}
	
	
}
