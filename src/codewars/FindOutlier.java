package codewars;

public class FindOutlier {
    static int find(int[] integers){
        int iskomoe=0;
        for (int i =0; i<integers.length; i++){
            if (integers[1]%2==0 || integers[2]%2==0){
                for ( i =0; i<integers.length; i++){
                    if(integers[i]%2!=0){
                        iskomoe=integers[i];
                        System.out.println(iskomoe);
                    }
                }
            }
        }
        for (int i =0; i<integers.length; i++){
            if (integers[1]%2!=0 || integers[2]%2!=0){
                for ( i =0; i<integers.length; i++){
                    if(integers[i]%2==0){
                        iskomoe=integers[i];
                        System.out.println(iskomoe);
                    }
                }
            }
        }
        return iskomoe;
    }
}
