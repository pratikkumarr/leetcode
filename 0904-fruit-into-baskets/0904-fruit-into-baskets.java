class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left =0, ans=0;
        int d1=-1, d2=-1;
        int count1=0, count2=0;
        for(int right=0; right<n; right++){
            int f = fruits[right];
            if(d1==-1 || f==d1){
                d1 = f;
                count1++;
            } else if(d2==-1 || f==d2){
                d2 = f;
                count2++;
            } else {
                while(left<=right){
                    if(fruits[left]==d1){
                        count1--;
                    } else {
                        count2--;
                    }
                    left++;

                    if(count1==0){
                        d1 = f;
                        count1 = 1;
                        break;
                    }
                    if(count2==0){
                        d2 = f;
                        count2=1;
                        break;
                    }
                }
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}