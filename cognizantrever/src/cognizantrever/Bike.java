package cognizantrever;
 class Bike{
	int speed = 100;
	void run(){
		 speed =200;

		System.out.println("bike safely with 50kmph");
		}  
	
	 int cube( int n){  
		   n=n+2;//can't be changed as n is final  
		  return n*n*n;  
		  }  

}  
  
class Honda1 extends Bike{  
  void run(){System.out.println("running safely with 100kmph");}  
    
  public static void main(String args[]){  
  Honda1 honda= new Honda1();  
  honda.run();  
  }  
} 