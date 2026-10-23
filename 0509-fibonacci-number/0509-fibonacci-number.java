class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int prev=0;
        int curr=1;
        int fib=0;
        for(int i=2;i<=n;i++){
           fib=prev+curr;
           prev=curr;
           curr=fib;
        }
        return fib;
    }
}