package root;

class Person{
	
	int id;
	String name;
	
	public Person() {
		System.out.println("Constructor");
	}
}

public class App {

	public static void main(String[] args) {
		System.out.println("Bismillah!");
		int a = 5;
		int b = 2;
		// 5 = 101, 
		// 2 = 010
		// 5 & 2 = 000
		// 5 | 2 = 111
		// 5 ^ 2 = 111
		System.out.println(5&2); 
		System.out.println(5|2); 
		System.out.println(5^2); 
		
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
		
		// +=
		
		a += 10;
		a = a + 1;
		
		String string = "JAVA";
		String string2 = new String("JAVA");
		
		if (string.equals(string2)) {
			System.out.println("=");
		}
	
		// 10 = 1010
		// 10 << 2 = 101000 = 40
		// 2^5+ 2^3
		
		for (int i =0; i <=a; i++);
	}
}
