package labs;

public class DoublyLinkedInts {
    private DoublyNode head = null;
    private DoublyNode tail = null;

    public void append(int userInt) {
        DoublyNode newNode = new DoublyNode(userInt);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public static void main (String[] args) {
        DoublyLinkedInts dll = new DoublyLinkedInts();
        int[] ints = {5, 3, 9, 4};

        for(int i = 0; i < ints.length; i++) {
            dll.append(ints[i]);
        }
    }
}

