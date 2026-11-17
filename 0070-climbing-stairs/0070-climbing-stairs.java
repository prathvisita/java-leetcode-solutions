class Solution {
    private static int distinctWays(int[] dp,int n){
      if(n<=1) return n;
       if(dp[n]!=0){
        return dp[n];
       }
       return dp[n]=distinctWays(dp,n-2)+distinctWays(dp,n-1);
    }
    public int climbStairs(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int[] dp=new int[n+1];
          dp[1]=1;
          dp[2]=2;
          return distinctWays(dp,n);
    }
}