package codewars;

public class Human_Readable_Time {
    public static String makeReadable(int seconds) {
        String hours = null, minutes = null, sec = null;

        if (seconds < 0 || seconds == 0) {
            return "00:00:00";
        }

        for (int i = 0; i <= 99; i++) {
            if (seconds < 0) {
                break;
            }
            for (int j = 0; j <= 59; j++) {
                if (seconds < 0) {
                    break;
                }
                for (int k = 0; k <= 59; k++, seconds--) {
                    if (seconds < 0) {
                        break;
                    }
                    hours = String.valueOf(i);
                    minutes = String.valueOf(j);
                    sec = String.valueOf(k);
                }
            }
        }
        char[] arrH = hours.toCharArray();
        char[] arrM = minutes.toCharArray();
        char[] arrS = sec.toCharArray();
        if (arrH.length<2){
            hours = "0"+hours;
        }
        if (arrM.length<2){
            minutes = "0"+minutes;
        }
        if (arrS.length<2){
            sec = "0"+sec;
        }

        String str = hours +":"+ minutes +":"+ sec;
        return str;
    }
}
