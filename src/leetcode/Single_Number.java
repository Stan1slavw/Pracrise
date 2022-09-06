package leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Single_Number {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(singleNumber(arr));
    }


    public static int singleNumber(int[] nums) {
        for (int i=0; i<nums.length; i++){
            int counter=0;
            for (int j=0; j<nums.length; j++){
                if (nums[i]==nums[j]){
                    counter++;
                }
            }
            if (counter==1){
                return nums[i];
            }
        }
        return -1;
    }
}
