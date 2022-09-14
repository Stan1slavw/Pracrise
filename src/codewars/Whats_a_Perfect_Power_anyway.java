package codewars;

public class Whats_a_Perfect_Power_anyway {
    public static int[] isPerfectPower(int n) {
        double sqrt = Math.sqrt(n);
        for (int i = 2, j = 2; i <= sqrt; ) {
            final int abc = (int) Math.pow(i, j);

            if (abc == n) {
                return new int[]{i, j};
            } else if (abc > n) {
                i++;
                j = 2;
            } else {
                j++;
            }
        }
        return null;
    }
}
