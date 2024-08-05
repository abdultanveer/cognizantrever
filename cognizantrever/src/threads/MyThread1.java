package threads;
class MyThread1 extends Thread{  
	Table t;  
	
	MyThread1(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(5);  
	}  

}  
class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
		this.t=t;  
	}  
	public void run(){  
		t.printTable(100);  
	}  
}  