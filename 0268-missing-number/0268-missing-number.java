class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedsum=n*(n+1)/2;
        int cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum=cursum+nums[i];
        }
        int missingnum=expectedsum-cursum;
        return missingnum;
    }
}