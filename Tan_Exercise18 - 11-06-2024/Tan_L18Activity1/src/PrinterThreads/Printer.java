package PrinterThreads;

public class Printer implements Runnable{
	private String documentName;
	
	public Printer(String documentName) {
		this.documentName = documentName;
	}
	
	private void printDocuments() {
		System.out.println("Printing: " + getDocumentName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("Finished printing: " + getDocumentName());
	}
	
	public String getDocumentName() {
		return documentName;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printDocuments();
	}

}
