package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Removing_Stars_From_a_String {
    public static void main(String[] args) {
        removeStars("leet**cod*e");
    }

    public static String removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }else {
                stack.pop();
            }
        }
        for (Character character : stack) {
            result.append(character);
        }
        return String.valueOf(result);
    }
}
//arr[i].equals("*") && arr[i-1]!=null