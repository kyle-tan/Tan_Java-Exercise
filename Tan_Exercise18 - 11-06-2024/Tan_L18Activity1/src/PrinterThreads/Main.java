package PrinterThreads;

public class Main {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Printer("Manuscript_Final.pdf"));
		Thread thread2 = new Thread(new Printer("Manuscript_Final_Final.pdf"));
		
		thread1.start();
		thread2.start();
		
		System.out.println();
		
//		if(thread1.isAlive()) {
//			System.out.println("Thread-1 status: running.");
//		} else { 
//			System.out.println("Thread-1 status: terminated.");
//		}
//		if(thread2.isAlive()) {
//			System.out.println("Thread-2 status: running");
//		} else {
//			System.out.println("Thread-2 status: terminated.");
//		}
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread has ended.");
		
	}
}
