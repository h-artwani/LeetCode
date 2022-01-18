/* 
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-2^31 <= x <= 2^31 - 1
*/

import java.util.*;

public class RevInteger {

    public static int reverse(int x) {
        String str = "";
        if (x > 0)
            str = String.valueOf(x);
        else
            str = String.valueOf(-1 * x);
        int revNum = 0;
        String nstr = "";
        char ch;


        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        try{
        revNum = Integer.valueOf(nstr);
        }
        catch (Exception e){
            return 0;
        }
        if(x>0) 
            return revNum; 
        else 
            return (-1*revNum);
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 32 bit signed integer.");
        int n = sc.nextInt();
        if (n > (Math.pow(2, 31) - 1) || n < Math.pow(-2, 31))
            System.out.println("Wrong Input");
        int res = reverse(n);
        System.out.println("Rev Number is " + res);
    }
}
