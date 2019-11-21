package labs;

public class NodeChar {
    public char data;
    public NodeChar next;
    public NodeChar (char userChar) {
        data = userChar;
        next = null;
    }

    public String toString() {
        return Character.toString(data);
    }

}

