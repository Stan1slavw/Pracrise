package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        int[]arr1 = {1,2,4};
        int[]arr2 = {1,3,4};
        merge(arr1, arr2);
    }
//its not a solved, its a random cod that I write for task number 21.
    public static void merge(int[]arr1, int[]arr2){
        int[] arr3 = new int[arr1.length+arr2.length];

        for (int i=0; i< arr3.length/2;i++){
            arr3[i]=arr1[i];
        }
        int k=0;
        for (int i= arr3.length/2; i< arr3.length;i++){
            arr3[i]=arr2[0];
            k++;
        }

        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
