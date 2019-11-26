package labs;

public class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode prev;

    public DoublyNode(int data) {
        this.data = data;
        next = null;
        prev = null;

        // next and prev made null so it can be changed later when linking
    }
}
