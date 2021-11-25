package org.prowess.mod1;

public class Department {
	private  int deptId;
	 private  String deptname;
	 private  String deptHeadName;
	 
	 
	public Department(int dertId, String dertname, String dertHeadName) { // create a constructor 
		super();
		this.deptId = dertId;
		this.deptname = dertname;
		this.deptHeadName = dertHeadName;
	}
	public String toString()
	{
		return   "Dept Id :"+deptId +" " +"DEPT NAME : "+ deptname+ " DEPT HeadName: "+ deptHeadName;
	}
	public int getdeptId() { // create a get method into dept id field
		return deptId;
	}
	public String getDeptname() { //create a get method into dept name field
		return deptname;
	}
	public String getDeptHeadName() {
		return deptHeadName;
	}

	
	  
	

}
