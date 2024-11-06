package MessagingSystem;

class SendMessage {
	synchronized void printMessage(String message) {
		System.out.println("Sending a message: " + message);
		System.out.println(message + " sent");
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	
}

public class MessagingApp {
	public static void main(String[] args) {
		SendMessage sms = new SendMessage();
		Thread t1 = new Thread(() -> sms.printMessage("Hello"));
		Thread t2 = new Thread(() -> sms.printMessage("My Name is JavaBot"));
		Thread t3 = new Thread(() -> sms.printMessage("Nice to meet you!"));
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
