//Q.Given an integer x, return true if x is a palindrome, and false otherwise.

//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.


class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(x>0){
            int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }

        return temp==sum;
    }
}
