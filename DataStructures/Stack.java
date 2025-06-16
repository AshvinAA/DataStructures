package DataStructures;

public class Stack {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node top;


    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public Integer pop() {
        if (top == null) return null;
        int value = top.val;
        top = top.next;
        return value;
    }


    public Integer peek() {
        return (top != null) ? top.val : null;
    }


    public boolean isEmpty() {
        return top == null;
    }
}
