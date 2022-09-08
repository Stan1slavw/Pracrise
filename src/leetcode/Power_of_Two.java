package leetcode;

public class Power_of_Two {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
    public static boolean isPowerOfTwo(int n) {
        for (double i=0; i<n; i++){
            if (Math.pow(2, i) ==n){
                return true;
            }
            if (Math.pow(2, i)>n){
                return false;
            }
        }
        return false;
    }
}
