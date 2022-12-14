//stduent class - version 1
class Student{
	//instance variable
	int id;
	String name;
	int marks;
	//setter methods to store id
	void setId( int id){
		this.id=id;
	}
	//getter method to get the id
	int getId(){
		return id;
	}
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
	void setMarks(int marks){
		this.marks=marks;
	}
	int getMarks(){
		return marks;
	}
}