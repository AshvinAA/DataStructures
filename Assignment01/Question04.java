package CSE220.Assignment01;

public class Question04 {
    public static void main(String[] args) {

    }
    static boolean q04(LinkedList2 l){
        boolean ascending=true;
        Node2 node=l.head;
        while(node.next!=null){
            Node2 nodeNext=node.next;
            if(node.number>nodeNext.number){
                ascending=false;
                break;
            }
            else {
                node=node.next;
            }
        }
        return ascending;
    }
}
class Node2 {
    int number;
    Node2 next;
}
class LinkedList2 {
    Node2 head;

    void insert(int data){
        Node2 node=new Node2();
        node.number =data;
        node.next=null;

        if(head==null){
            head=node;
        }
        else {
            Node2 n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
}
