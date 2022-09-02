package codewars;
import java.util.*;

public class Find_Maximum_and_Minimum_Values_of_a_List {
    public  int min(int[] list) {
        int min=0;

        min = Arrays.stream(list).min().getAsInt();
        return min;
    }

    public int max(int[] list) {
        int max=0;

        max = Arrays.stream(list).max().getAsInt();
        return max;
    }
}
