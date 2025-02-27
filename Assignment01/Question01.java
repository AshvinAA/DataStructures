package CSE220.Assignment01;

import java.util.Arrays;

public class Question01 {
    public static void main(String[] args) {

    }
    static int[] q01(int[] arr1,int[] arr2){
        int[] arr=new int[arr1.length+arr2.length];
        int l=0,r=0,z=0;
        while(l<arr1.length && r<arr2.length){
            if(arr1[l]<=arr2[r]){
                arr[z++]=arr1[l++];
            }
            else {
                arr[z++]=arr2[r++];
            }
        }
        while (l<arr1.length){
            arr[z++]=arr1[l++];
        }
        while (r<arr2.length){
            arr[z++]=arr2[r++];
        }
        return arr;
    }
}
