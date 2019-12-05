package labs;

public class Queue {
    Node front = null;
    Node back = null;

    int size = 0;

    public void enqueue(Object o) {
        size++;
        Node newNode = new Node(o);
        if (back == null) {
            front = newNode;
            back = newNode;
        }
        else {
            back.next = newNode;
            back = newNode;
        }
    }

    public Object dequeue() {
        size --;
        Node temp = front;
        if (front == null) {
            front = null;
            back = null;
        }
        else {
            front = front.next;
        }
        return temp.data;
    }

    public String toString() {
        return "There are " + size + " orders waiting.";
        // overrides the toString so we can customize what the reference variable prints
    }
}
