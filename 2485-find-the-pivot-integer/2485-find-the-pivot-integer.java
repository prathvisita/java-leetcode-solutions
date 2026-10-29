class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        for(int i=1;i<=n;i++) sum+=i;
        int l=0;
        for(int j=1;j<=n;j++){
            int r=sum-l-j;
            if(r==l) return j;
            l+=j;
        }
        return -1;
    }
}