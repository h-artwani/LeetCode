/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 

Constraints:

1 <= s.length <= 10^4
s consists of parentheses only '()[]{}'. */

import java.util.*;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        String [] sArray = s.split("");
        ArrayList<String> strList = new ArrayList<String>(Arrays.asList(sArray));
        int i=0;
        if(strList.size()==1)
            return false;
        while(!strList.isEmpty()){
            if(i==strList.size()-1)
                return false;
            if(strList.get(i).equals("(")){
                if(strList.get(i+1).equals("}") || strList.get(i+1).equals("]")) return false;
                else if(strList.get(i+1).equals(")")){
                    strList.remove(i+1);
                    strList.remove(i);
                    if(i!=0)
                        i--;
                }else {
                    i++;
                    continue;
                }
            } else if(strList.get(i).equals("{")){
                if(strList.get(i+1).equals(")") || strList.get(i+1).equals("]")) return false;
                else if(strList.get(i+1).equals("}")){
                    strList.remove(i+1);
                    strList.remove(i);
                    if(i!=0)
                        i--;
                }else {
                    i++;
                    continue;
                }
            } else if(strList.get(i).equals("[")){
                if(strList.get(i+1).equals("}") || strList.get(i+1).equals(")")) return false;
                else if(strList.get(i+1).equals("]")){
                    strList.remove(i+1);
                    strList.remove(i);
                    if(i!=0)
                        i--;
                }else {
                    i++;
                    continue;
                }
            } else return false;
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(isValid("){"));
    }

}
