package DataStructures;

import java.util.ArrayList;

public class MaxHeap {
    ArrayList<Integer> heap = new ArrayList<>();

    void sink(int index) {
        int largest = index;
        int leftIndex = left(index);
        int rightIndex = right(index);

        if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(largest)) {
            largest = leftIndex;
        }

        if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(largest)) {
            largest = rightIndex;
        }

        if (largest != index) {
            swap(index, largest);
            sink(largest);
        }
    }

    void swim(int index){
        if(index==0){
            return;
        }
        Integer parent= heap.get(parent(index));
        if(parent> heap.get(index)){
            swap(parent(index),index);
            swim(parent(index));
        }
    }

    void insert(int value){
        heap.add(value);
        swim(heap.size()-1);
    }

    int pop(){
        int value= heap.get(0);
        int lastValue= heap.get(heap.size() - 1);
        heap.set(0, lastValue);
        heap.remove(heap.size() - 1);
        sink(0);
        return value;
    }

    ArrayList<Integer> heapSort(){
        ArrayList<Integer> arr= new ArrayList<>();
        while (!heap.isEmpty()){
            arr.add(pop());
        }
        return arr;
    }

    private int left(int index){
        return index*2 +1;
    }
    private int right(int index){
        return index*2+2;
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private void swap(int a,int b){
        int temp= heap.get(a);
        heap.set(a, heap.get(b));
        heap.set(b,temp);
    }
}
