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
            sum=sum-nums[i-1];
            sum+=nums[j];
            double avg=sum/k;
            if(avg>maxAvg){
                maxAvg=avg;
            }
            i++;
            j++;
        }
        return maxAvg;
    }
}