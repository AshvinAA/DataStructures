package CSE220.Assignment01;

public class Question03 {
    public static void main(String[] args) {

    }
    static void q03(LinkedList l1, LinkedList l2){
        boolean similarity=true;
        Node node1=l1.head;
        Node node2=l2.head;
        while(node1.next!=null){
            if(node1.color!=node2.color){
                similarity=false;
                break;
            }
            else {
                node1=node1.next;
                node2=node2.next;
            }
        }
        if(similarity){
            System.out.println("Similar");
        }
        else {
            System.out.println("Not Similar");
        }
    }

}
class Node {
    String color;
    Node next;
}
class LinkedList {

    Node head;

    void insert(String data){
        Node node=new Node();
        node.color =data;
        node.next=null;

        if(head==null){
            head=node;
        }
        else {
            Node n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
}
