package labs;

public class LinkedListChar {
    private NodeChar head;

    public LinkedListChar() {
        head = null;
    }

    public void store (String userWord) {
        for (int i = 0; i < userWord.length(); i++) {
            add(userWord.charAt(userWord.length() - 1 - i));
        }
    }

    private void add(char c) {
        NodeChar node = new NodeChar(c);
        node.next = head;
        head = node;
    }

    public String toString() {
        String s = "";
        NodeChar current = head;
        while (current != null) {
            s = s + current.data;
            current = current.next;
        }
        return s;
    }

    public static void main (String[] args) {
        LinkedListChar myLLC = new LinkedListChar();
        myLLC.store("Joe");
        System.out.println(myLLC);
    }
}
