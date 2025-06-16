package DataStructures;
import java.util.*;

public class Hashmap {
    int size;
    class Node {
        String key;
        int data;
        Node next;

        Node(String key, int data) {
            this.key = key;
            this.data = data;
        }
    }

    private Node[] file;

    Hashmap(int size) {
        this.size = size;
        this.file = new Node[size];
    }

    void insert(String name, int grade) {
        int hashedIndex = hash(name);

        Node node = file[hashedIndex];

        if (node == null) {
            file[hashedIndex] = new Node(name, grade);
            return;
        }
        Node prev = null;

        while (node != null) {
            if (node.key.equals(name)) {
                node.data = grade;
                return;
            }
            prev = node;
            node = node.next;
        }
        prev.next = new Node(name, grade);
    }

    int hash(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            count += name.charAt(i);
        }
        return count % size;
    }
    int get(String name){
        int hashedIndex=hash(name);
        Node node=file[hashedIndex];
        while (node!=null){
            if(node.key.equals(name)){
                return node.data;
            }
            node=node.next;
        }
        return -1;
    }

    void delete(String name) {
        int hashedIndex = hash(name);
        Node node = file[hashedIndex];
        Node prev = null;

        while (node != null) {
            if (node.key.equals(name)) {
                if (prev == null) {
                    file[hashedIndex] = node.next;
                } else {
                    prev.next = node.next;
                }
                return;
            }
            prev = node;
            node = node.next;
        }
        System.out.println(name + " not found");
    }
}
