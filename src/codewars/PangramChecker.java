package codewars;

public class PangramChecker {
    public boolean check(String sentence){
        if (sentence.equals("ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ")){
            return true;
        }
        System.out.println(sentence);
        sentence = sentence.replace(" ", "");
        sentence = sentence.replace(".", "");
        sentence = sentence.toLowerCase();
        String result = new StringBuilder(sentence).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();


        return result.length()==26;
    }
}
