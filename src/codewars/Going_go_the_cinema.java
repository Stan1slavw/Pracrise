package codewars;

public class Going_go_the_cinema {
    public static int movie(int card, int ticket, double perc) {

        int visits = 0;
        double A = 0;
        double B = card;

        while (Math.ceil(B) >= A) {
            visits++;
            A += ticket;
            B += ticket * Math.pow(perc, visits);
        }
        return visits;
    }
}
