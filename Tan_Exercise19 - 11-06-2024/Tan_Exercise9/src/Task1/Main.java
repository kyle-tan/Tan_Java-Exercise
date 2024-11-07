package Task1;

public class Main {
	//a. Declare a task where its class is a subclass of Thread.
	static class ThreadClass extends Thread {
		@Override
		public void run() {
			System.out.println("Subclass of thread");
		}
	}
	
	//b. Create an instance of the thread class and start it.
	//d. Create an instance of the task and pass it to a thread to execute.
	//e. Implement a function to wait a thread to finish.
	//g. Implement a statement to pause execution for 1 seconds.
	public static void main(String[] args) {
		ThreadClass tc = new ThreadClass();
		RunnableClass rc = new RunnableClass();
		Thread t1 = new Thread(rc);
		Main temp = new Main();
		
		try {
			tc.start();
			temp.synchronizedMethod();
			tc.join();
			Thread.sleep(1000);
			System.out.println("Thread Slept for 1 second.");
			t1.start();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Threads finished executing.");
		
	}
	//c. Declare a task that implements the Runnable interface.
	static class RunnableClass implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable class");
		}
		
	}
	//f. Create a synchronized block using the instance object variable lock.
	public void synchronizedMethod() {
		synchronized(this) {
			System.out.println("Synchronized Block");
		}
	}
}
