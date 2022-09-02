package codewars;

import java.util.*;

public class Highest_and_Lowest {
    public static String highAndLow(String numbers) {
        String[] arrStr = numbers.split(" ");
        int[] arrInt = new int[arrStr.length];
        for (int i=0; i< arrStr.length; i++){
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }

        System.out.println(Arrays.toString(arrInt));

        int min=arrInt[0];
        int max =arrInt[0];

        for (int i =0; i< arrInt.length; i++){
            if (arrInt[i]<min){
                min = arrInt[i];
            }
            if (arrInt[i]>max){
                max = arrInt[i];
            }
        }
        return max +" "+ min;
    }
}
