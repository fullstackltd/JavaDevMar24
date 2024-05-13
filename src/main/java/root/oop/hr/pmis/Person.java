package root.oop.hr.pmis;

public class Person {
	// access modifier
	// 1. private
	// 2. protected
	// 3. public
	// 4. default

	// property / variable / field / column / data 
	/*
	 * Types of variable
	 * 1. Instance / Object variable
	 * 2. Static / Class variable
	 * 3. Local variable
	 */
	private String name;
	private String gender;
	private int age;
	private int height;
	private String address;
	public static String universityName;

	// Behavior / Method / Function / Code / Operation
	/*
	 * Constructor is a special kind of method which is called automatically or
	 * implicitly. It is normally used for initialize the instance variable.
	 * 
	 */
	// Default constructor

	public Person() {
		this.universityName = "";
		System.out.println("Defaul constructor");
	}

	public Person(String name) {
		this();
		this.name = name;
		System.out.println("1 parameters");
	}

	public Person(String name, int age) {
		this(name);
		this.age = age;
		System.out.println("2 parameters");
	}
	
	public Person(int age, String name) {
		this(name);
		this.age = age;
		System.out.println("2 parameters");
	}

	public Person(int age) {
		this.universityName = "";
		this.age = age;
	}

	public Person(String name, int age, int height) {
		this(name, age);
		this.height = height;
		System.out.println("3 parameters");
	}

	public Person(String name, int age, int height, String gender) {
		this(name, age, height);
		this.gender = gender;
		System.out.println("4 parameters");
	}

	public Person(String name, int age, int height, String gender, String address) {
		this(name, age, height, gender);
		this.address = address;
		System.out.println("5 parameters");
	}
	public Person(String name, String gender, int age, int height, String address) {
		this(name, age, height, gender);
		this.address = address;
		System.out.println("5 parameters");
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(int height) {
		if (height >=100)
			this.height = height;
		else {
			System.out.println("You are not allowed");
		}
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public static String getUniversityName() {
		return universityName;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", height=" + height + ", address="
				+ address + ", UniName="+Person.universityName+"]";
	}

//	public static void setUniversityName(String universityName) {
//		Person.universityName = universityName;
//	}

	public int add(int a, int b) {
		System.out.println("Person: add");
		int result = a + b;
		return result;
	}
	public double add(int a, double b) {
		System.out.println("Person: add");
		return a + b;
	}
	public double add(double a, int b) {
		System.out.println("Person: add");
		return a + b;
	}
	public double add(double a, double b) {
		System.out.println("Person: add");
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		System.out.println("Person: add");
		return a + b + c;
	}
	
	public void drive() {
		System.out.println("Person can drive a motorbike");
	}

	{
		System.out.println("Code block b4 constructor");
		this.age = 1;
	}
	
	static {
		System.out.println("Static code block is invoked one for class loading");
//		Person.universityName = "NU";
	}
	
	

}
