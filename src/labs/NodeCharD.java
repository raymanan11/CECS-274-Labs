package labs;

public class NodeCharD {
    public char data;
    public NodeCharD prev;
    public NodeCharD next;

    public NodeCharD (char userChar) {
        data = userChar;
        prev = null;
        next = null;
    }

    public String toString() {
        return Character.toString(data);
    }
}
