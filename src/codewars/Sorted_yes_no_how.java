package codewars;

public class Sorted_yes_no_how {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6};
        System.out.println(isSortedAndHow(arr));
    }
    public static String isSortedAndHow(int[] array) {
        int asce=0;
        int desce=0;
        for (int i=0; i< array.length-1;i++){
            if (array[i]>= array[i+1]){
                desce++;
            }
            if (array[i]<=array[i+1]){
                asce++;
            }

        }
        if (asce==array.length-1){
            return "yes, ascending";
        }
        if (desce==array.length-1) {
            return "yes, descending";
        }
        return "no";
    }
}
