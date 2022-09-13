package codewars;

public class Youre_a_square {
    public static boolean isSquare(int n) {
        double result;
        if (n < 0) {
            return false;
        }
        result = Math.sqrt(n);
        return !(result > (int) result);
    }
}
