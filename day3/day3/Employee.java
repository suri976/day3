package day3;

import java.time.LocalDateTime;

public class Employee {
	int sId;
	String fullName;
	LocalDateTime dateOfJoining;
	Address current;
	Address permanent;
	static String classType;
	Employee()
	{
		
	}
	
	 
	 public Employee(int empId, String fullName, LocalDateTime dateOfJoining, Address residence, Address communication
	,String classType) {
		super();
		this.sId = empId;
		this.fullName = fullName;
		this.dateOfJoining = dateOfJoining;
		this.current = residence;
		this.permanent = communication;
		Employee.classType=classType;

	}


	public int getsId() {
		return sId;
	}


	public void setsId(int sId) {
		this.sId = sId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public LocalDateTime getDateOfJoining() {
		return dateOfJoining;
	}


	public void setDateOfJoining(LocalDateTime dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


	public Address getCurrent() {
		return current;
	}


	public void setCurrent(Address current) {
		this.current = current;
	}


	public Address getPermanent() {
		return permanent;
	}


	public void setPermanent(Address permanent) {
		this.permanent = permanent;
	}


	public static String getClassType() {
		return classType;
	}


	public static void setClassType(String classType) {
		Employee.classType = classType;
	}


	@Override
	public String toString() {
		return "Employee [sId=" + sId + ", fullName=" + fullName + ", dateOfJoining=" + dateOfJoining + ", current="
				+ current + ", permanent=" + permanent + "]";
	}
	 
	
}