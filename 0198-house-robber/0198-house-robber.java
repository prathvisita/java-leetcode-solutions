class Solution {
    public int rob(int[] nums) {
    //    int maxAmount=0;
    //    int fs=0;
    //    int ss=0;
    //    for(int k=0;k<nums.length;k++){
    //     int sum1=0;
    //     int sum2=0;
    //    for(int i=k;i<nums.length;i+=2){
    //     sum1+=nums[i];
    //     if(sum1>fs){
    //         fs=sum1;
    //     }
    //    }
    //     for(int j=k;j<nums.length;j+=3){
    //     sum2+=nums[j];
    //      if(sum2>ss){
    //         ss=sum2;
    //     }
    //    }
    //    }
    //    return maxAmount=Math.max(fs,ss);
        if(nums==null){
        return 0;
        }
        if(nums.length==1){
            return nums[0];
        }

      int  dp[]=new int[nums.length];
      dp[0]=nums[0];
      dp[1]=nums[1];

      for(int i=2;i<dp.length;i++){
        if(i<=2){
            dp[i]=dp[i-2]+nums[i];
        }else{
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-3]+nums[i]);
        }
      }
     int max=0;
      for(int i=0;i<dp.length;i++){
        if(dp[i]>max){
            max=dp[i];
        }
      }
      return max;

    }
}