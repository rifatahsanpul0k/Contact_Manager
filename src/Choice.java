import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Choice {
    public static void choice(byte choice) {
        Scanner input = new Scanner(System.in);
        boolean contactFound = false;

        switch (choice) {
            case 1:
                // Add new contact:
                System.out.println("Enter the name: ");
                String name = input.nextLine();
                System.out.println("Enter mobile number: ");
                String number = input.nextLine();
                Contact contact = new Contact(name, number);
                Add.contacts.add(contact);
                System.out.println("Contact Added Successfully");
                break;

            case 2:
                // Edit a contact:
                System.out.println("Enter the number you want to edit: ");
                String number1 = input.nextLine();

                for (Contact contactItem : Add.contacts) {
                    if (contactItem.Number.equals(number1)) {
                        contactFound = true;
                        System.out.println("Select:\n1.Update Name\n2.Update Number");
                        choice = input.nextByte();

                        switch (choice) {
                            case 1:
                                // Update name
                                input.nextLine(); // Consume the newline character
                                System.out.println("Enter Name: ");
                                contactItem.Name = input.nextLine();
                                System.out.println("Contact Edited Successfully");
                                break;

                            case 2:
                                // Update number
                                input.nextLine(); // Consume the newline character
                                System.out.println("Enter Number: ");
                                contactItem.Number = input.nextLine();
                                System.out.println("Contact Edited Successfully");
                                break;
                        }
                    }
                }

                if (!contactFound) {
                    System.out.println("Contact not Found.");
                }
                break;

            case 3:
                // Delete a contact:
                System.out.println("Enter Name or Number: ");
                String nameOrNumber = input.nextLine();

                List<Contact> contactsToRemove = new ArrayList<>();

                for (Contact contactItem : Add.contacts) {
                    if (contactItem.Name.equals(nameOrNumber) || contactItem.Number.equals(nameOrNumber)) {
                        contactsToRemove.add(contactItem);
                        contactFound = true;
                    }
                }

                for (Contact contactItem : contactsToRemove) {
                    Add.contacts.remove(contactItem);
                }

                if (contactFound) {
                    System.out.println("Contact Deleted Successfully");
                } else {
                    System.out.println("Contact couldn't be Found");
                }
                break;
        }
    }
}
