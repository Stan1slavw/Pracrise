package hackerrank;

import java.util.*;
import java.util.regex.*;

public class Tag_Content_Extractor {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher matcher = null;
        while (testCases > 0) {
            String line = in.nextLine();
            matcher = pattern.matcher(line);

            if (!matcher.find()) {
                System.out.println("None");
            } else {
                do {
                    System.out.println(matcher.group(2));
                } while (matcher.find());
            }
            testCases--;
        }
        in.close();
    }
}
