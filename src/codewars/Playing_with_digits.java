package codewars;

public class Playing_with_digits {
    public static long digPow(int n, int p) {
        long temp = 0;
        String[] value = String.valueOf(n).split("");
        for (int i = 0; i < value.length; i++) {
            temp += Math.pow(Double.parseDouble(value[i]), (p + i));
        }
        return temp % n == 0 ? temp / n : -1;
    }
}
