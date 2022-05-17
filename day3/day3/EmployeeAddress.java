package day3;

import java.time.LocalDateTime;

public class EmployeeAddress {

	public static void main(String[] args) {
		Address res=new Address("23-45","Abc","vizag");
		Address off=new Address("1st floor","gjh","trp");
		Employee  std=new Employee(1,"suresh",LocalDateTime.now(),res,off,"distance");
		
		System.out.println(res);
		System.out.println(off);
		System.out.println();
		
		
	std.getPermanent().setCity("Ongole");;
		System.out.println(res);
		System.out.println(off);
		System.out.println(std);
		System.out.println();
		
		Employee.classType="regular";
		
		System.out.println(res);
		System.out.println(off);
		System.out.println(std);
		
		

		Address res1=new Address("56-34","fgh","rjy");
		Address off1=new Address("2nd floor","gjh","vzy");
		Employee  emp1=new Employee(24,"somesh",LocalDateTime.now(),res,off,"regular");
		
		System.out.println(res1);
		System.out.println(off1);
		System.out.println(emp1);
		
		Employee.classType="distance";

		Address res2=new Address("45-34","hre","viayanagaram");
		Address off2=new Address("5th floor","gjh","khammam");
		Employee  emp2=new Employee(36,"mani",LocalDateTime.now(),res,off,"regular");

		
		System.out.println(res2);
		System.out.println(off2);
		System.out.println(emp2);
		
		Address res3=new Address("65-34","r nilayam","guntur");
		Address off3=new Address("6th floor","k block","khammam");
		Employee  emp3=new Employee(54,"ganesh",LocalDateTime.now(),res,off,"distance");
		
		System.out.println(res3);
		System.out.println(off3);
		System.out.println(emp3);
		
		
		
		
	}

}