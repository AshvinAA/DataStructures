package DataStructures;

public class Queue {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;  // front
    private Node tail;  // rear

    public void insert(int val) {
        Node newNode = new Node(val);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = newNode;
        }
    }


    public Integer pop() {
        if (head == null) {
            return null;
        }
        int value = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }


    public Integer peek() {
        return (head != null) ? head.val : null;
    }


    public boolean isEmpty() {
        return head == null;
    }
}
