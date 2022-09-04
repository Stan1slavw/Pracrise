package leetcode;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 7));
    }
    public static int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            if (target==nums[i]){
               return i;
            }
            if (target<nums[i]){
                return i;
            }
            if (target>nums[nums.length-1]){
                return nums.length;
            }
        }
       /* for (int i=0; i<nums.length; i++){
            if (target<nums[])
        }*/
        return 0;
    }
}
