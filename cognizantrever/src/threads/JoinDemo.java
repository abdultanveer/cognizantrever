package threads;

public class JoinDemo {

	public static void main(String[] args) {
		Collegue collegue1 = new Collegue();
		collegue1.setName("ameri");
		Collegue collegue2 = new Collegue();
		collegue2.setName("jeorge");
		Collegue collegue3 = new Collegue("martins");
		
		
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
