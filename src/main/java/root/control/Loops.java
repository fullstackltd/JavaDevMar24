package root.control;

public class Loops {

	public static void main(String[] args) {

		/*
		 * Control Statement / Construct 1. Sequence
		 * 
		 * 2. Selection - if-else / switch-case
		 * 
		 * 3. Iteration 
		 * 	- Definite Loop 
		 * 	- for loop 
		 * 	- for-each loop 
		 * - Indefinite Loop 
		 * 	- while loop 
		 * 	- do..while loop
		 */

		// Sequence
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
// n + n = n
// n * n * n * n * n = n^5

		// for loop
		// for (initial; compare; increment)

//		for (int row = 1; row <= 3; row++) {
//			System.out.print("Row: "+row+" | ");
//			for (int col = 1; col <= 3+1 - row; col++) {
//				System.out.print(col+" ");
//			}
//			System.out.println();
//		}
		
		/* 
		 * Assignment # 1
		 * Row: 1 | 1 
		 * Row: 2 | 1 2 
		 * Row: 3 | 1 2 3
		 * 
		 * Assignment # 2
		 * Row: 1 | 1 2 3
		 * Row: 2 | 1 2 
		 * Row: 3 | 1 
		 * 
		 */

//		int i = 1;
//		for (int j = 1; j <= 4; j++) {
//			System.out.println(j+".");
//			for (i = 1; i <= 3; i++) {
//				System.out.println("\t"+j+"."+i+".");
//				for (int k = 1; k <= 3; k++) {
//					System.out.println("	\t\t"+j+"."+i+"."+k+".");
//					for (int l = 1; l <= 3; l++) {
//						System.out.println("	\t\t\t"+j+"."+i+"."+k+"."+l+".");
//						for (int m = 1; m <= 3; m++) {
//							System.out.println("\t\t\t\t"+j+"."+i+"."+k+"."+l+"."+m+".");
//						}
//					}
//				}
//			}
//		}
		
		// while loop
		
//		int i = 0;
//		while (i<=10) {
//			System.out.println("i : "+ ++i);
//		}
//		int j = 0;
//		do {
//			System.out.println("Dhaka"+j++);
//		}while(j<=10);
		
		// continue
		for (int i=0; i<=9; i++) {
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Close: ");
	}

}
