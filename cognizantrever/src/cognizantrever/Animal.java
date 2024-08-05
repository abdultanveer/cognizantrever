package cognizantrever;
class Animal{
	public void eat() {System.out.println("animal is eating");}
	
	 public static void main(String args[]){  
		  Dog d1 = new Dog();  
		  d1.eat();
		  
		  Animal a = new Dog();
		  a.eat();
				 
		  
		 } 
}  
  
class Dog extends Animal{  
	public void eat() {System.out.println("dog is eating");}
 
} 