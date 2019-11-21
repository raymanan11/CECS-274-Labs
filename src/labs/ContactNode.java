package labs;

public class ContactNode {
    private String name;
    private String phoneNumber;

    private ContactNode next;

    public ContactNode (String userName, String userNumber){
        name = userName;
        phoneNumber = userNumber;

        next = null;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ContactNode getnext() {
        return next;
    }

    public void setNext(ContactNode userContactNode) {
        next = userContactNode;
    }

    public String toString() {
        return "Name: " + getName() + "\n" + "Phone number: " + getPhoneNumber() + "\n";
    }

    public static void main(String[] args) {
        ContactNode contactNode = new ContactNode("Raymond", "7156407974");
        System.out.println(contactNode);
    }
}
