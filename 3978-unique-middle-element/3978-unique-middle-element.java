class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int low=0;
        int end=nums.length-1;
        int mid=low+(end-low)/2;
        int midNum=nums[mid];
      while(end>mid&&low<mid){
        if(nums[low]==nums[mid]){
            return false;
        }
        if(nums[end]==nums[mid]){
            return false;
        }
        low++;
        end--;
      }
      return true;
    }
}