package codewars;

public class Sum_of_Digits_Digital_Root {
    public static int digital_root(int n) {
        if (n<10) return n;

        int a = 0;

        while(n>0) {
            a += n % 10;

            n = n / 10;
        }

        return digital_root(a);
    }
}
