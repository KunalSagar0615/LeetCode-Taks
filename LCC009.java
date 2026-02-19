// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        String str = Integer.toString(Math.abs(x));
        
        String reversed = new StringBuilder(str).reverse().toString();
        
        try {
            int result = Integer.parseInt(reversed);
            return negative ? -result : result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
