package codewars;

public class Number_of_trailing_zeros_of_N {
    public static int zeros(int n) {

        int counter = 0;

        if (n < 0){
            return -1;
        }

        for (int i = 5; n / i >= 1; i *= 5){
            counter += n / i;
        }

        return counter;
    }
}
