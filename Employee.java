package org.prowess.mod1;

import java.util.Scanner;

public class Employee {
	
	
	private int empid;
    private 	String empname;
	private float empsal;
	 private Department  empdept; // this is reference variable to hold  depr object 
	// private static Scanner scan  = new Scanner(System.in);
	 
	/* public Employee()
	 {
		 System.out.println("enter empname");
		 empname =scan.next();
		 System.out.println("enter emp salary");
		 empsal=scan.nextInt();
		 System.out.println("enter emp ");
	 }*/
	 
	 
	 public Employee(int empid, String empname, float empsal, Department empdept) { // create a constructor 
			super();
			this.empid = empid;
			this.empname = empname;
			this.empsal = empsal;
			this.empdept = empdept;
		}
		
	 
	 
	 public  String toString() {
		 return 
				 " dept Id:  "+empid +
				 "\nName  :"+ empname+
				 "\nSalary Rs.  :"+empsal+
				 "\nDept :"+empdept.getdeptId()+
				 "\nDept name:"+empdept.getDeptname()+
				 "\nDeptHeadName: "+empdept.getDeptHeadName();
				 
	 }
	

}
