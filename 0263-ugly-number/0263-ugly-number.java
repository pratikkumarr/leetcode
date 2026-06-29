class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        while(n>0){
            if(n==1) return true;
            if(n%30==0) n/=30;
            else if(n%15==0) n/=15;
            else if(n%6==0) n/=6;
            else if(n%5==0) n/=5;
            else if(n%3==0) n/=3;
            else if(n%2==0) n/=2;
            else return false;
        }
        return true;
    }
}