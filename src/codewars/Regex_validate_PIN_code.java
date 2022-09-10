package codewars;

public class Regex_validate_PIN_code {
    public static boolean validatePin(String pin) {
        int count=0;

        char[] array = pin.toCharArray();
        for (char ch: array){
            if (ch =='1' || ch =='2' || ch =='3' || ch =='4' || ch =='5' || ch =='6'|| ch =='7'|| ch =='8'|| ch =='9'|| ch =='0') {
                count++;
            }else {
                return false;
            }
        }
        if (count==4 || count ==6){
            return true;
        }
        return false;
    }
}
