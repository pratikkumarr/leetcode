class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int b, h, left = 0, right = n-1, area, mArea = 0;
        while(left<right){
            b = right-left;
            h = min(height[left], height[right]);
            area = b*h;
            mArea = max(area, mArea);
            if(height[left]>height[right]){
                right--;
            } else{
                left++;
            }
        }
        return mArea;
    }
};