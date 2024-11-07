package PrinterThreads;

public class Printer implements Runnable{
	private String documentName;
	
	public Printer(String documentName) {
		this.documentName = documentName;
	}
	
	private void printDocuments() {
		System.out.println("Printing: " + documentName);
		synchronized (Printer.class){
			try {
				System.out.println(Thread.currentThread().getName() + " status: running");
				Thread.sleep(2000);
				System.out.println("Finished printing: " + documentName);
				System.out.println(Thread.currentThread().getName() + " status: terminated");
			} catch (InterruptedException e) {
				System.out.println("Printing Interrupted for " + documentName);
			}
		}
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printDocuments();
	}

}
