/*Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
*/


import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        if((new String(sArray)).equals(new String(tArray))){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        System.out.println(isAnagram("anagram", "nagaram")); //INPUT HERE
    }
}
