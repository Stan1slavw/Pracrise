package codewars;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Next_smaller_number_with_the_same_digits {
    public static long nextSmaller(long n){
        Integer[] val = Long.toString(n).chars().map(c -> c - '0').boxed().toArray(Integer[]::new);
        int len = val.length;
        for (int i = len - 1; i > 0; i--) {
            if (val[i - 1] > val[i]) {
                int maxIdx = i;
                for (int j = i + 1; j < len; j++) {
                    if (val[i - 1] > val[j] && val[j] > val[maxIdx]) maxIdx = j;
                }
                val[i - 1] = val[i - 1] + val[maxIdx];
                val[i - 1] = val[i - 1] - (val[maxIdx] = val[i - 1] - val[maxIdx]);

                Arrays.sort(val, i, len, Collections.reverseOrder());
                return val[0] == 0 ? - 1L : Long.parseLong(String.join("", Stream.of(val).map(String::valueOf).toArray(String[]::new)));
            }
        }
        return -1L;
    }
}
