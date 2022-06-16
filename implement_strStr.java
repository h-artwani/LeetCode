//Problem 28

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")) return 0;
        if(haystack.contains(needle)){
            for(int i = 0; i < haystack.length() ; i++){
                if(haystack.charAt(i) == needle.charAt(0)){
                    if(needle.equals(haystack.substring(i, i + needle.length()))){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
