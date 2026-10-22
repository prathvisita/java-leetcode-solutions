class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxAvg=sum/k;
        int i=1;
        int j=k;
        while(j<nums.length){
            sum=sum-nums[i-1]+nums[j];
            maxAvg=Math.max(maxAvg,sum/k);
            i++;
            j++;
        }
        return maxAvg;
    }
}