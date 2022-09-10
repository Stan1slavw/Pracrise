package leetcode;

import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0]!=0) {
            return nums[0]-1;
        }
        for (int i=0; i<nums.length-1; i++){
            if (nums[i+1]-nums[i]!=1){
                return nums[i]+1;
            }
        }
        return nums[nums.length-1]+1;
    }
}
