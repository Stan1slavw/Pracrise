package leetcode;

public class Valid_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String[] arr = s.split("");

        boolean isPal = false;

        for (int i=0; i< arr.length; i++){
            if (arr[i].equals(arr[arr.length-1-i])){
                isPal = true;
            }else {
                return false;
            }
        }

        return isPal;
    }
}
