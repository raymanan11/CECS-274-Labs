package labs;
import java.util.Scanner;

public class ContactList {

    public static String getPhoneNumber(String[] nameVec, String[] phoneNumberVec, String contactName,  int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            if (nameVec[i].equals(contactName)) {
                return phoneNumberVec[i];
            }
        }
        return null;
    }

    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);

        int numContact = scnr.nextInt();

        String[] contacts = new String[numContact];
        String[] phoneNumbers = new String[numContact];

        for (int i = 0; i < numContact; i++) {
            contacts[i] = scnr.next();
            phoneNumbers[i] = scnr.next();

        }

        String name = scnr.next();

        System.out.println(getPhoneNumber(contacts, phoneNumbers, name, numContact));

    }
}
