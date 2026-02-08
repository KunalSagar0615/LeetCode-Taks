//Q Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        for(int i=0;i<haystack.length()-n;i++){
            String str=haystack.substring(i,i+n);
            if(needle.equals(str))
                return i;
        }
        return -1;
    }
}
