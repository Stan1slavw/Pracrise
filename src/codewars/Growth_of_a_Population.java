package codewars;

public class Growth_of_a_Population {
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years =0;
        while (p0<p){
            p0 = p0 + aug + (int)(p0*percent/100);
            years ++;
        }
        return years;
    }
}
