package HashMapPhoneBook;

import java.util.HashMap;

public class Phonebook {
	HashMap<String, Long> phoneBook; 
	
	public Phonebook() {
		phoneBook = new HashMap <String, Long>();
	}
	
	public void addContact(String name, long phoneNumber) {
		phoneBook.put(name, phoneNumber);
	}
	
	public void displayContacts() {
		for(String i : phoneBook.keySet()) {
			System.out.printf("+ %s\n", i);
		}
	}
	
	public void searchContacts(String name) {
		boolean exist = false;
		for(String j : phoneBook.keySet()) {
			if(j.equalsIgnoreCase(name)) {
				exist = true;
				System.out.printf("\nName: %s\nPhone Number: %d\n", j, phoneBook.get(j));
			}
		}
		if(!exist) {
			System.out.println("Name does not exist in contacts");
		}
	}
}
