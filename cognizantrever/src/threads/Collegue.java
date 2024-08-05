package threads;

public class Collegue extends Thread {
	
	@Override
	public void run() {
		super.run();
		for(int i=0;i < 5 ;i++) {
			try {
				Thread.sleep(300);
				System.out.println(i);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
