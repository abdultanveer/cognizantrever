package inheritance;
class A{  
	A(){System.out.println("hello a");}  //default constructor
	
	A(int x){  //parameterized constructor
		this();  //invoking default constructor
		System.out.println(x);  
	}  
	
	int add(int a,int b) {
		return a+b;
	}
	
	double add(double a,int b) {
		return a+b;
	}
}  
