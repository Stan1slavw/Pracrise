package codewars;

public class Letterbox_Paint_Squad {
    public static int[] paintLetterboxes(final int start, final int end) {
        int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;
        for (int i = start; i <= end; i++) {
            String str = Integer.toString(i);
            char[] array = str.toCharArray();
            for (char ch : array) {
                switch (ch) {
                    case '0' -> zero++;
                    case '1' -> one++;
                    case '2' -> two++;
                    case '3' -> three++;
                    case '4' -> four++;
                    case '5' -> five++;
                    case '6' -> six++;
                    case '7' -> seven++;
                    case '8' -> eight++;
                    case '9' -> nine++;
                    default -> {
                    }
                }
            }

        }
        return new int[]{zero,one,two,three,four,five,six,seven,eight,nine};
    }
}
