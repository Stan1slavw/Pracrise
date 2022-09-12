package codewars;

public class Take_a_Ten_Minutes_Walk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int x = 0;
        int y = 0;

        for (Character i : walk) {
            switch (i) {
                case 'n' -> y++;
                case 's' -> y--;
                case 'e' -> x--;
                case 'w' -> x++;
                default -> {
                }
            }
        }

        return x == 0 && y == 0;
    }
}
