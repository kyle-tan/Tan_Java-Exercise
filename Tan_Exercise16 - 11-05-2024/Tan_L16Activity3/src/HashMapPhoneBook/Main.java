package HashMapPhoneBook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Phonebook phoneBook = new Phonebook();
		System.out.println("Kyle's Phonebook");
		
		while(true) {
			System.out.println("\n [1] Add contacts\n [2] Display contacts\n"
					+ " [3] Search contact\n [4] Close\n");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case 1:
					System.out.print("Input name here: ");
					String name = scanner.nextLine();
					System.out.print("Input number of " +name+ " here: ");
					long phoneNumber = scanner.nextLong();
					
					phoneBook.addContact(name, phoneNumber);
					break;
					
				case 2:
					phoneBook.displayContacts();
					break;
				case 3:
					System.out.print("Search a name: ");
					String searchName = scanner.nextLine();
					phoneBook.searchContacts(searchName);
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Please Select from the choices.");
			}
		}
	}

}


