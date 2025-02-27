package CSE220.Assignment01;

import java.util.LinkedList;

public class Question05 {
    public static void main(String[] args) {

    }
    static void q05(LinkedList3 linkedList,int[] dist){

        int sum=0;
        for(int i=0;i<dist.length;i++){
            if(dist[i]<= linkedList.index && dist[i]>=0){
                Node2 node= linkedList.head;
                for(int j=0;j<dist[i];j++){
                    node=node.next;
                }
                sum+=node.number;
            }
            else{
                sum+=0;
            }
        }
        System.out.println(sum);
    }
}


class LinkedList3 {
    Node2 head;
    int index=-1;

    void insert(int data){
        Node2 node=new Node2();
        node.number =data;
        node.next=null;

        if(head==null){
            head=node;
            index++;
        }
        else {
            Node2 n=head;
            while (n.next!=null){
                n=n.next;
            }
            n.next=node;
            index++;
        }
    }
}