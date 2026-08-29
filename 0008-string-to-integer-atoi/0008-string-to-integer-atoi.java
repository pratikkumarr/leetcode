class Solution {
    public int myAtoi(String s) {
        int i = 0;
        while(i < s.length() && s.charAt(i)==' ') i++;
        int sign = 1;
        if(i < s.length()  && (s.charAt(i) == '+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-') sign = -1;
            i++;
        }
        return helper(s, i, 0, sign);
    }

    private int helper(String s, int i, long n, int sign){
        if(i>=s.length() || !Character.isDigit(s.charAt(i))) return (int)(sign*n);

        int digit = s.charAt(i) - '0';
        n = n*10 + digit;
        if(sign*n <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if(sign*n >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

        return helper(s, i+1, n, sign);
    }
}