package threads;

public class JoinDemo {

	public static void main(String[] args) {
		Collegue collegue1 = new Collegue();
		Collegue collegue2 = new Collegue();
		Collegue collegue3 = new Collegue();
		
		collegue1.start();
		
		try {
			collegue1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		collegue2.start();
		collegue3.start();

		
	}

}
