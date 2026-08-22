class Solution {
    public boolean checkDivisibility(int n) {
        int x = n, digitSum = 0, digitPro = 1;
        while(x>0){
            int digit = x%10;
            digitSum+=digit;
            digitPro*=digit;
            x/=10;
        }
        return (n%(digitSum+digitPro)==0);
    }
}