package codewars;

public class Square_Sum {
    public static int squareSum(int[] n){
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = n[i] * n[i];
            sum += n[i];
        }
        return sum;
    }
}
