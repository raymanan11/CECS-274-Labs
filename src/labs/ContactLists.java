package labs;
import java.util.Scanner;

public class ContactLists {
    ContactNode head;
    ContactNode tail;

    public ContactLists() {
        head = null;
        tail = null;
    }

    public void addLast(ContactNode userContactNode) {
        ContactNode newNode = userContactNode;
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.setNext(newNode);
            tail = newNode;
        }

    }

    public String toString() {
        String fullContactList = "";
        ContactNode current = head;
        while (current != null) {
            fullContactList = fullContactList + current.toString();
            current = current.getnext();
        }
        return fullContactList;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String userName;
        String userNumber;
        String moreContacts;
        ContactLists allContacts = new ContactLists();

        System.out.println("Enter a contact to the contact list:");

        do {
            System.out.println("Enter name:");
            userName = scnr.nextLine();
            System.out.println("Enter phone number:");
            userNumber = scnr.nextLine();


            ContactNode node = new ContactNode(userName, userNumber);
            allContacts.addLast(node);

            System.out.println("Enter \"Y\" to add more contacts: ");
            moreContacts = scnr.nextLine();


            if (!moreContacts.equals("Y")) {
                System.out.println("CONTACT LIST");
                System.out.println(allContacts);
                break;
            }
        }
        while (moreContacts.equals("Y"));
    }

}
