package codewars;

import java.util.Arrays;

public class Stop_gninnipS_My_sdroW {
    public String spinWords(String sentence) {
        String out = null;
        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = arr[i].length() >= 5 ? arr[i] = new StringBuffer(arr[i]).reverse().toString() : arr[i];
        }
        out = Arrays.toString(arr);
        return out = out.substring(1, out.length() - 1).replaceAll(",", "");
    }
}
