package root.oop.hr;

import root.oop.hr.pmis.Employee;

public class Programmer extends Employee {
	
	String workMode;
	int speialBonus;
	
	public Programmer(String workMode, int speialBonus) {
		this.workMode = workMode;
		this.speialBonus = speialBonus;
	}

	public String getWorkMode() {
		return workMode;
	}

	public void setWorkMode(String workMode) {
		this.workMode = workMode;
	}

	public int getSpeialBonus() {
		return speialBonus;
	}

	public void setSpeialBonus(int speialBonus) {
		this.speialBonus = speialBonus;
	}
	
	public void setDepartment(String depString) {
		super.setDept(depString);
	}
}
