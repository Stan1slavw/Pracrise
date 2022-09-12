package leetcode;

import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'o'};
        reverseString(arr);
    }
    public static void reverseString(char[] s) {
        char tmp =0;
        for (int i=0; i<s.length-1-i; i++){
            tmp = s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=tmp;
        }
    }
}
