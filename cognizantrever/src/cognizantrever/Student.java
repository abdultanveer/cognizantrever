package cognizantrever;

//box -- 3 partitions --- name,age,address
public class Student {
	
	String name;
	int age;          //instance variable
	String address;
	static String COLLEGE_NAME = "IIT";
	
	public Student(String name, int age, String address) {
		super();
		//this = 100
		this.name = name;
		this.age = age;
		this.address = address;
		
		System.out.println("name in this object is "+this.name);
	}
	{this.age = 18;}
	public Student() {
	}
	
	

}
