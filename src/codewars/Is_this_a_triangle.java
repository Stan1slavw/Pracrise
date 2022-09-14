package codewars;

public class Is_this_a_triangle {
    public static boolean isTriangle(int a, int b, int c){
        return a + b > c && a+c>b && b+c>a;
    }
}
