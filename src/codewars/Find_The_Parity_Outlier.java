package codewars;

public class Find_The_Parity_Outlier {
    static int find(int[] integers){
        int counter = 0;
        int counter2 = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                counter++;
            } else if (integers[i]%2!=0) {
                counter2++;
            }
        }
        if (counter>counter2){
            for (int i=0; i<integers.length; i++){
                if (integers[i]%2!=0){
                    return integers[i];
                }
            }
        }else {
            for (int i=0; i<integers.length; i++){
                if (integers[i]%2==0){
                    return integers[i];
                }
            }
        }
        return 0;
    }
}
