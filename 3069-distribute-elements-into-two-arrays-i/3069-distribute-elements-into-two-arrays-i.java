class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length,i=0;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        int[] result = new int[n];
        arr1.add(nums[i++]);
        arr2.add(nums[i++]);
        while(i<n){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) arr1.add(nums[i++]);
            else arr2.add(nums[i++]);
        }
        for(i=0; i<arr1.size(); i++){
            result[i] = arr1.get(i);
        }
        for(int j=0;j<arr2.size(); j++){
            result[i++] = arr2.get(j);
        }
        return result;
    }
}