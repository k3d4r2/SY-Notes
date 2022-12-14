public class Use{
	public static void main(String args[]){
		//create object of Student
		Student s = new Student();
		s.setId(46);
		s.setName("Jayesh");
		s.setMarks(50);
		
		Student3 s3 = new Student3();
	    s3.setId(49);
		s3.setName("Shubham");
		s3.setMarks(50);
		
		
		//retrieve data using getter methods and display
		System.out.println("Id ="+s.getId());
		System.out.println("Name ="+s.getName());
		System.out.println("Marks ="+s.getMarks());
		System.out.println(" ");
		System.out.println("Id ="+s3.getId());
		System.out.println("Name ="+s3.getName());
		System.out.println("Marks ="+s3.getMarks());
	}

}