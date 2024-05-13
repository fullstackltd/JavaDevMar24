package root;

public class Test {

	public static double calcPayment(int value, int discount, int shippingCost) {
		return value - value * discount * 0.01 + shippingCost;
	}
	
	public static void main(String[] args) {
		System.out.println(calcPayment(1000, 10, 19)); // T@1
		System.out.println(calcPayment(1000, 10, 29)); // T#2
		System.out.println(calcPayment(1000, 10, 49)); // T$3
	}
}
