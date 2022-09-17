package codewars;

public class Who_likes_it {
    public static String whoLikesIt(String... names) {
        String str = "";
        int counter = names.length -2;
        if (names.length ==0) {
            str = "no one likes this";
        }else {
            for (int i = 0; i < names.length; i++) {
                if (names[i].length() == 0) {
                    str = "no one likes this";
                    break;
                }
                if (i == 0) {
                    if (names[i].equals(" ")) {
                        str = "no one likes this";
                        break;
                    }
                    str = names[0] + " likes this";
                }
                if (i == 1) {
                    str = names[0] + " and " + names[1] + " like this";
                }
                if (i == 2) {
                    str = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                }
                if (i > 2) {
                    str = names[0] + ", " + names[1] + " and " + counter + " others like this";
                }
            }
        }
        return str;
    }
}
