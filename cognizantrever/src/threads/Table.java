package threads;

class Table{  
	void printTable(int n){//method not synchronized  
		System.out.println("thread --"+Thread.currentThread().getName()+"has entered the bank");
		synchronized (this) {
			System.out.println("thread --"+Thread.currentThread().getName()+"has entered the ATM");


			for(int i=1;i<=5;i++){  
				System.out.println(n*i);  
				try{  
					Thread.sleep(400);  
				}catch(Exception e){System.out.println(e);}  
			}  

		}  
		System.out.println("thread --"+Thread.currentThread().getName()+"has left the ATM");


	}  
}
