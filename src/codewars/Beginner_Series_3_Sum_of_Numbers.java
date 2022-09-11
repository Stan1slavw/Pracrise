package codewars;

public class Beginner_Series_3_Sum_of_Numbers {
    public int GetSum(int a, int b)
    {
        int count = 0;
        if (a == b) return a;
        if(a < b){
            for (; a <= b; a++){
                count += a;
            }
        } else if (a > b){
            for(; b <= a; b++){
                count += b;
            }
        }
        return count;
    }
}
