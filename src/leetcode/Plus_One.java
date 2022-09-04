package leetcode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] arr = {9, 9,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));

    }
    //Задачу расписал, так как сам долго не понимал че тут происходит
    public static int[] plusOne(int[] digits) {

        //Начинаем с конца массива
        for (int i = digits.length - 1; i >= 0; i--) {
            //Если последний элемент массива меньше 9, то мы его увеличиваем на 1 и возвращаем весь массив
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            //Если элемент не меньше 9, то мы его зануляем и идем к слудющему элементу.
            // Если следующий элемент меньше 9, то увеличиваем и возвращаем массив
            else {
                digits[i] = 0;
            }
        }
        //Если мы занулили все элементы массива, а такое может быть толькое если массив равен [9,9,9,9,9...]
        // То создаем новый массив с размеров на один больше и делаем первы  элемент равным 1.
        // Так как по дефолту массив заполняется нулями, то ничего переписывать не нужно
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
    }

//    public static int[] check(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 10) {
//                arr[i] = 0;
//                arr[i - 1] = arr[i - 1] + 1;
//            }
//        }
//    }



