package DataStructures;

public class LinkedList {
     class Node{
        int value;
        Node next;

         Node(int value) {
             this.value = value;
         }
    }

    Node head;

    void insert(int value) {
        head = insertHelper(head, value);
    }

    private Node insertHelper(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        node.next = insertHelper(node.next, val);
        return node;
    }

    void delete(int val){
        if (head == null) return;
        if(head.value==val){
            head=head.next;
        }
        else {
            deleteHelper(head,val);
        }
    }

    private void deleteHelper(Node node, int val) {

        if (node == null || node.next == null) return;

        if (node.next.value == val) {
            node.next = node.next.next;
        } else {
            deleteHelper(node.next, val);
        }
    }

}
