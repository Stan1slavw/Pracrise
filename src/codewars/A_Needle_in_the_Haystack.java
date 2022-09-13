package codewars;

public class A_Needle_in_the_Haystack {
    public static String findNeedle(Object[] haystack) {
        for (int i=0; i<haystack.length; i++) {
            if (haystack[i] == "needle")
                return "found the needle at position "+i;
        }
        return null;
    }
}
