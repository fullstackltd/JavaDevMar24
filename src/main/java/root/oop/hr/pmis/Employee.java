package root.oop.hr.pmis;

import java.time.LocalDate;

public class Employee extends Person {
	private String designation;
	private int salary;
	private String dept;
	private LocalDate hireDate;
	private String jobType;
	
	public Employee() {
		
	}
	public Employee(String designation, int salary, String dept, LocalDate hireDate) {
		super();
		this.designation = designation;
		this.salary = salary;
		this.dept = dept;
		this.hireDate = hireDate;
		
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	protected void setDept(String dept) {
		this.dept = dept;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", salary=" + salary + ", dept=" + dept + ", hireDate="
				+ hireDate + ", jobType=" + jobType + "]";
	}
	
	public int add(int a, int b, int c, int d) {
		System.out.println("Employee: add");
		return a+b+c+d;
	}
	
	public int add(int a, int b) {
		System.out.println("Employee: add");
		return a+b;
	}
	
	@Override
	public void drive() {
		System.out.println("Emplyee can drive a car");
	}
}
