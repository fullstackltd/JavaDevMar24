package root.oop.hr;

import root.oop.hr.pmis.Person;

public class OOConcept {

	public static void main() {
		System.out.println("My main");
	}

	
	public static void main(String[] args) {
		Person rakibPerson = new Person();
		rakibPerson.setName("Rakib");
		rakibPerson.setAge(27);

		System.out.println(rakibPerson);

		Person motiur = new Person();
		motiur.setName("Motiur Rahman");
		motiur.setAge(34);

		OOConcept.main();
	}

	// Object
	/*
	 * Object / occurrence / instance / 1. State / variable / field / property /
	 * data 2. Behavior / Method / Function / Operation / Code
	 */
	// C programming
	/*
	 * struct Person{ char name[20]; int age; int height; char gender; save(){
	 * 
	 * } } struct Student{ char name[20]; int age; int height; char gender; save(){
	 * 
	 * } } main(){ int i; Person p; p.name p.age }
	 */
	// Class
	/*
	 * Class / struct / Record / Table / File /
	 */
}
