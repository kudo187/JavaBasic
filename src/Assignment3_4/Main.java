package Assignment3_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Contact> arrContact = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		HandleContact handle = new HandleContact();
		arrContact.add(new Contact("Joy", "34543"));
		arrContact.add(new Contact("Jack", "56765"));
		arrContact.add(new Contact("Tina", "34567"));
		int select;
		while (true) {

			switch (handle.selectCommand()) {
			case 1:
				arrContact.add(handle.inputContact());
				break;
			case 2:
				System.out.println("Input phone want check");
				String phone = sc.next();
				handle.checkContactByPhone(arrContact, phone);
				break;
			case 3:
				System.out.println("Input name want check");
				String name = sc.next();
				handle.checkContactByName(arrContact, name);
				break;
			case 4:
				System.out.println("Input name want delete");
				String nameDelete = sc.next();
				int index = handle.deleteContact(arrContact, nameDelete);
				if (index != -1) {
					arrContact.remove(index);
				}
				break;
			case 5:
				handle.shownListContact(arrContact);
				break;
			case 6:
				return;
			default:
				break;
			}
		}

	}
}
