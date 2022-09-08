package codewars;

public class Vowel_Count {
    public static void main(String[] args) {

    }
    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] arr = str.toCharArray();
        for (char ch: arr){
            if (ch =='a'|| ch =='e' || ch=='i' || ch=='o' || ch=='u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
