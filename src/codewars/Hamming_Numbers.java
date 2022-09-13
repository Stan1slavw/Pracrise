package codewars;

public class Hamming_Numbers {
    public static long hamming(int n) {
        long[] abc = new long[n];
        abc[0] = 1;
        long x2 = 2, x3 = 3, x5 = 5;
        int i = 0, j = 0, k = 0;

        for (int i1 = 1; i1 < n; i1++) {
            abc[i1] = Math.min(x2, Math.min(x3, x5));
            if (abc[i1] == x2) x2 = 2 * abc[++i];
            if (abc[i1] == x3) x3 = 3 * abc[++j];
            if (abc[i1] == x5) x5 = 5 * abc[++k];
        }

        return abc[n - 1];
    }
}
