package inheritance;

public class Bike extends Vehicle{
	
	@Override ///redefining the existing method
	void run() {
		super.run();
		System.out.println("bike is running");
	}
	

}
