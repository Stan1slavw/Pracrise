package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits.length()==0) return result;
        int idx=0; String output="";
        String[] map= new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits,output,idx,result,map);
        return result;
    }
    private static void solve(String digits,String output,int idx,List<String> result,String[] map)
    {
        if(idx>=digits.length())
        {
            result.add(output);
            return;
        }

        int num = Integer.parseInt("" + digits.charAt(idx));
        String str=map[num];

        for(int i=0;i<str.length();i++)
        {
            output+=str.charAt(i);
            solve(digits,output,idx+1,result,map);
            output=output.substring(0,output.length()-1);
        }
    }
}
