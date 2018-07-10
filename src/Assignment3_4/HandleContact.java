package Assignment3_4;

import java.util.ArrayList;
import java.util.Scanner;

public class HandleContact {
	Scanner sc = new Scanner(System.in);

	public Contact inputContact() {
		System.out.println("Input information contact");
		System.out.println("Input name: ");
		String name = sc.next();
		System.out.println("Input phone: ");
		String phone = sc.next();
		Contact ct = new Contact(name, phone);
		return ct;

	}

	public int selectCommand() {
		int select;
		do {
			System.out.println("You choose the command");
			System.out.println("1. Add contact");
			System.out.println("2. Check phone exist");
			System.out.println("3. Check name exist");
			System.out.println("4. Delete contact by name");
			System.out.println("5. Shown list contact");
			System.out.println("6. Exit");
			select = sc.nextInt();
		} while (select <= 0 && select > 6);
		return select;
	}

	public void shownListContact(ArrayList<Contact> ct) {
		System.out.println("List contact");
		for (Contact contact : ct) {
			System.out.println(contact.getName() + "  " + contact.getPhone());
		}
	}

	public void checkContactByName(ArrayList<Contact> arrContact, String name) {
		boolean check = false;
		String phone = null;
		for (Contact arr : arrContact) {
			if (arr.getName().equals(name)) {
				check = true;
				phone = arr.getPhone();
				break;
			} else {
				check = false;
			}
		}
		if (check) {
			System.out.println(name + " does exist in list and phone is :" + phone);
		} else {
			System.out.println(name + " does not exist in list");
		}

	}

	public void checkContactByPhone(ArrayList<Contact> arrContact, String phone) {
		boolean check = false;
		String name = null;
		for (Contact arr : arrContact) {
			if (arr.getPhone().equals(phone)) {
				check = true;
				name = arr.getName();
				break;
			} else {
				check = false;
			}
		}
		if (check) {
			System.out.println(phone + " does exist in list and Name is :" + name);
		} else {
			System.out.println("This phone does not exist in list");
		}
	}
	
	public int deleteContact(ArrayList<Contact> ct, String name)
	{
		boolean check = false;
		int count = 0;
		for (Contact contact : ct) {
			if (contact.getName().equals(name)) {
				check = true;
				break;
			}
			count++;
		}
		if(!check)
		{
			System.out.println("Name you want to delete does not exist");
			return -1;
		}
		else
		{
			return count;
		}
	}

}
