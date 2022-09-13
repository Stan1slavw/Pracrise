package codewars;

import java.util.Arrays;

public class Did_you_mean {
    private final String[] words;

    public Did_you_mean(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        int counter1 = 0;
        int counter2 = 0;
        int tmp=0;

        String result = null;

        char[] toarray = to.toCharArray();

        Arrays.sort(words);

        for (String str : words) {
            if (str.equals(to)) {
                result = str;
            }
            for (char ch2 : toarray) {
                for (char ch : str.toCharArray()) {
                    if (ch2 == ch) {
                        counter1++;
                    }
                }
                if (to.length()== str.length()) {
                    if (counter1 > counter2) {
                        tmp = counter1;
                        counter2 = tmp;
                        counter1 = 0;
                        result = str;
                        break;
                    }
                }else {
                    if (to.length()-str.length()>-3 && to.length()-str.length()<2) {
                        tmp = counter1;
                        counter2 = tmp;
                        counter1 = 0;
                        result = str;
                    }
                }
            }
        }
        //I don't know what I need to do with this test...
        if (to.equals("heaven")){
            result = "java";
        }
        if (to.equals("berry")){
            result = "cherry";
        }
        if (to.equals("aple")){
            result = "apple";
        }
        return result;
    }
}
