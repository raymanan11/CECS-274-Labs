package labs;

public class LinkedListCharV2 {
    private NodeCharD head;
    private NodeCharD tail;

    public LinkedListCharV2() {
        head = null;
    }

    public void append(String userString) {
        for (int i = 0; i < userString.length(); i++) {
            char c = userString.charAt(i);
            addBack(c);
        }
    }

    public void prepend(String userString) {
        for (int i = 0; i < userString.length(); i++) {
            char c = userString.charAt(userString.length() - 1 - i);
            addFront(c);
        }
    }

    private void addBack(char c) {
        NodeCharD newNode = new NodeCharD(c);
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

    private void addFront(char c) {
        NodeCharD newNode = new NodeCharD(c);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public String toString() {
        String s = "";
        NodeCharD current = head;
        while (current != null) {
            s = s + current.data;
            current = current.next;
        }
        return s;
    }

    public String toStringBackwards() {
        String s = "";
        NodeCharD current = tail;
        while (current != null) {
            s = s + current.data;
            current = current.prev;
        }
        return s;
    }

    public static void main (String[] args) {
        LinkedListCharV2 myDLC = new LinkedListCharV2();
        myDLC.append("got");
        System.out.println(myDLC.toStringBackwards());
        myDLC.prepend("Joe");
        myDLC.append("this");

        System.out.println(myDLC);
    }
}
