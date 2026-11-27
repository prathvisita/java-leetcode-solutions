class Solution {
    // private static int pro(int[] dp,int[] nums,int n,int maxp){
    //     if(n==nums.length-1){
    //         maxp=Math.max(maxp,dp[n]);
    //         return maxp;
    //     }
    //     dp[n]=Math.max(nums[n],nums[n]*pro(dp,nums,n+1,maxp));
    //     // maxp=Math.max(maxp,dp[n]);
    //     return maxp;

   // }
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        // int[] dp=new int[nums.length];
        // dp[dp.length-1]=nums[nums.length-1];
        //int[] res=pro(dp,nums,n);
        // int n=0;
        // int maxp=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int product=1;
        //     for(int j=i;j<nums.length;j++){
        //             product*=nums[j];
        //             maxp=Math.max(maxp,product);
        //     }
        // }
       
       // return pro(dp,nums,n,maxp);
      
        int n = nums.length;
        int[] maxDp = new int[n];
        int[] minDp = new int[n];

        maxDp[0] = nums[0];
        minDp[0] = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            maxDp[i] = Math.max(curr, Math.max(curr * maxDp[i - 1], curr * minDp[i - 1]));
            minDp[i] = Math.min(curr, Math.min(curr * maxDp[i - 1], curr * minDp[i - 1]));

            globalMax = Math.max(globalMax, maxDp[i]);
        }

        return globalMax;
    

    }
}