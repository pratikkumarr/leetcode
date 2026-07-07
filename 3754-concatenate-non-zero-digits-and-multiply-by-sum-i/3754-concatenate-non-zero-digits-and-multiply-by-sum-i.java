class Solution {
    public long sumAndMultiply(int n) {
        long x = 0, sum=0;
        while(n>0){
            int k = n%10;
            if(k!=0){
                x = x*10 + k;
                sum+=k;
            }
            n/=10;
        }
        long ans=0;
        while(x>0){
            ans = ans*10 + x%10;
            x/=10;
        }
        return ans*sum;
    }
}