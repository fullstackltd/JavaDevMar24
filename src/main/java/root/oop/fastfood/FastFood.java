package root.oop.fastfood;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FastFood {

	public static void main(String[] args) {
		Customer tahsinCustomer = new Customer("Motiur", "+10000");
		
		Order order = new Order(1001, LocalDate.now(), tahsinCustomer);
		
		Item burger = new Burger	(1, "Burger", 199, "Chease");
		Item mojo = new Mojo(2, "Mojo", 25, 250, "Lemon");
		
		OrderLine line1 = new OrderLine(burger, 2, 229);
		OrderLine line2 = new OrderLine(mojo, 2, 30);
		
		List<OrderLine> orderLines = new ArrayList<OrderLine>();
		orderLines.add(line1);
		orderLines.add(line2);
		
		order.setOrderaLines(orderLines);
		
		order.printOrder();
		
	}
}
