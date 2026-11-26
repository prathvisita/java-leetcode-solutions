class Solution {
    private static int cl(int dp[],int n){
        if(n<=1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=cl(dp,n-2)+cl(dp,n-1);
    } 

    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int dp[]= new int[n+1];
        dp[1]=1;
        dp[2]=2;
        return cl(dp,n);
    }
}