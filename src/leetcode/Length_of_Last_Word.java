package leetcode;

public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String result = arr[arr.length-1];
        return result.length();
    }
}
