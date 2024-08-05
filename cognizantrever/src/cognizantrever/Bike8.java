package cognizantrever;
class Bike8{  
    int speed;  
      
    Bike8(){
    	System.out.println("instance initializer block invoked");
    	System.out.println("constructor is invoked");
    	}  
   
  
       
    public static void main(String args[]){  
    Bike8 b1=new Bike8();  
    Bike8 b2=new Bike8();  
    }      
}  