class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
        for(int i=2;i<dp.length;i++){
            if(i==2){
                dp[i]=dp[i-2]+nums[i];
            }else{
                dp[i]=Math.max(dp[i-2]+nums[i],dp[i-3]+nums[i]);
            }
        }
        int maxAmount=0;
        for(int i=0;i<dp.length;i++){
            maxAmount=Math.max(maxAmount,dp[i]);
        }
        return maxAmount;
    }
}