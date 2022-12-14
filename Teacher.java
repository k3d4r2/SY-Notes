public class Teacher{
	//instance variables
	int id;
	String name;
	String department;
	float sal;
	
	//setter method to store id
	void setId(int id){
		this.id=id;
	}
	//getter method to retrieve id
	int getId(){
		return id;
	}
	//setter method to store name
	void setName(String name){
		this.name=name;
	}
	//getter method to retrieve name
	String getName(){
		return name;
	}
	//setter method to store Department
	void setDepartment(String department){
		this.department=department;
	}
	//getter method to retrieve Department
	String getDepartment(){
		return department;
	}
	
	//setter method to store salary
	void setSal(float sal){
		this.sal=sal;
	}
	//getter method to retrieve salary
	float getSal(){
		return sal;
	}
	public static void main(String args[]){
		// create object to store Teacher Information
		Teacher t = new Teacher();
		
		// Store data into objects using setter method
		t.setId(2122000520);
		t.setName("Jayesh");
		t.setDepartment("AIML");
		t.setSal(50000);
		
		// retrieve data using getter methods and display
		System.out.println("ID= "+t.getId());
		System.out.println("Name= "+t.getName());
		System.out.println("Department= "+t.getDepartment());
		System.out.println("Salary= "+t.getSal());
	}

}