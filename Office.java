package org.prowess.mod1;

public class Office {

	public static void main(String[] args) {
		
		Department d1 = new Department (26,  "Raj",  "sai");
		Employee e1 = new Employee (347,"rajashekar",30000.0f, d1);
		
		System.out.println(e1);
	}
}

		
	