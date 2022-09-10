package codewars;

public class Equal_Sides_Of_An_Array {
    public static int findEvenIndex(int[] arr) {
        int result =-1;

        for (int i=0; i< arr.length; i++){
            int sum=0;
            int sum2=0;

            for (int j=0; j<i; j++){
                sum+=arr[j];
            }
            for (int d = arr.length-1; d>i; d-- ){
                sum2 += arr[d];
            }
            if (sum == sum2 ){
                result = i;
                break;
            }
        }
        return result;
    }
}
