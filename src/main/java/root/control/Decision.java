package root.control;

import java.util.Scanner;

public class Decision {

	public static void main(String[] args) {
		// switch
//		@SuppressWarnings("resource")
		int a = 5;
		int b = 2;
		
		if (a > b) {
			System.out.println("Greter than");
		}else if (a<b){
			System.out.println("Less ");
		}else {
			System.out.println("Equal");
		}
		
		// "Greter than" (a>b) else "Less or Equal"
		
		String resultString = (a>b) ? "Greter than" : "Less or Equal";
		System.out.println(resultString);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int choice = scanner.nextInt();
		scanner.close();
		
		switch (choice) {
		case 0:
			System.out.println("Exit");
			break;
		case 1:
			System.out.println("You choose 1");
			break;
		case 2:
			System.out.println("You choose 2");
			break;

		default:
			System.out.println("You choose else");
			break;
		}
	}
}
