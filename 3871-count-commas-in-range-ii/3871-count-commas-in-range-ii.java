class Solution {
    public long countCommas(long n) {
        if(n<1000) return 0;
        int digits = 0;
        long temp=n;
        while(temp!=0){
            digits++;
            temp/=10;
        }
        if(digits<7) return n-999;
        if(digits<10) return 999000L + 2L*(n-999999L);
        if(digits<13) return 1998999000L + 3L*(n-999999999L);
        if(digits<16) return 2998998999000L + 4L*(n-999999999999L);
        return 3998998998999005L;

    }
}