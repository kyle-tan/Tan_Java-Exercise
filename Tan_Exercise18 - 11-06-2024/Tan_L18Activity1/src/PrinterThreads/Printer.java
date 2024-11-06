package PrinterThreads;

public class Printer implements Runnable{
	private String documentName;
	
	public Printer(String documentName) {
		this.documentName = documentName;
	}
	
	private void printDocuments() {
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		printDocuments();
	}

}
