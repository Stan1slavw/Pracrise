package codewars;

import java.util.*;
public class Your_order_please {
    public static String order(String words) {

        if (words.isEmpty()){
            return "";
        }

        String[] str = words.split(" ");
        String[] newStr = new String[str.length];

        for (String s: str){
            for (char ch: s.toCharArray()){
                //i know...i know...i know...
                if (ch=='1'){
                    newStr[0]=s;
                }
                if (ch=='2'){
                    newStr[1]=s;
                }
                if (ch=='3'){
                    newStr[2]=s;
                }
                if (ch=='4'){
                    newStr[3]=s;
                }
                if (ch=='5'){
                    newStr[4]=s;
                }
                if (ch=='6'){
                    newStr[5]=s;
                }
                if (ch=='7'){
                    newStr[6]=s;
                }
                if (ch=='8'){
                    newStr[7]=s;
                }
                if (ch=='9'){
                    newStr[8]=s;
                }
            }
        }

        String result = Arrays.toString(newStr);
        result = result.replace("[", "");
        result = result.replace("]", "");
        result = result.replace(",", "");
        return result;
    }
}
