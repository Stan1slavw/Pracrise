package codewars;

public class Reversed_Strings {
    public static String solution(String str) {
        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        return new String(str1);
    }
}
