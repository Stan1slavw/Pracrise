package leetcode;

import java.util.*;

public class Valid_Parentheses{
    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> characters =new Stack<>();

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ){
                characters.push(s.charAt(i));
            }else if(s.charAt(i)==')' && !characters.isEmpty() && characters.peek()=='('){
                characters.pop();
            } else if(s.charAt(i)=='}'&& !characters.isEmpty() && characters.peek()=='{'){
                characters.pop();
            } else if(s.charAt(i)==']'&& !characters.isEmpty() && characters.peek()=='['){
                characters.pop();
            } else{
                characters.push(s.charAt(i));
                break;
            }
        }
        return characters.isEmpty();
    }
}
