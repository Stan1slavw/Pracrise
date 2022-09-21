package codewars;

public class Exes_and_Ohs {
    public static boolean getXO (String str) {

        int counterx=0;
        int countery=0;
        String str2 = str.toUpperCase();
        char[] str3 = str2.toCharArray();
        for (int i=0; i<str3.length; i++){
            char x= 'X';
            if (x==str3[i]){
                counterx++;
            }
        }
        for (int i=0; i<str3.length; i++){
            char o= 'O';
            if (o == str3[i]){
                countery++;
            }
        }
        return counterx==countery;

    }
}
