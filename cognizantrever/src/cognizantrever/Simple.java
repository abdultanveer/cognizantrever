package cognizantrever;

public class Simple {
	
	public static void main(String[] args) {
		System.out.println("hello world");
		//declaration
		Student abdul;  //creating an entry in toc  --- 100 stack
		abdul = new Student(); //instance of type student instantiation
		abdul.name = "ansari";  //initzn
		
		//abdul = new Student("ansari",123,"some address"); //heap box in RAM
		System.out.println("abdul name is "+abdul.name);
		System.out.println(abdul.age);
		
		
		
	}
	
	void add() {
		int result = 30; //local variable
	}

}
