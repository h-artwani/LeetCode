/* 
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

 

Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.
 

Constraints:

-2^31 <= n <= 2^31 - 1
*/

import java.util.*;

public class UglyNumber {

    public static boolean primeFactors(int number) {
        while(true){
            if(number%2==0){
                number=number/2;
            }
            else if(number%3==0){
                number= number/3;
            }
            else if(number%5==0){
                number= number/5;
            }
            else{
                break;
            }
        }
        if(number==1){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String args[]) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        number = sc.nextInt();
        boolean res=primeFactors(number);
        System.out.println(res);

    }
}
