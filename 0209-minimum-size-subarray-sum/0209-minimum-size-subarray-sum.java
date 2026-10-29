class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int length=Integer.MAX_VALUE;
        int i=0;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum>=target){
                length=Math.min(length,j-i+1);
                sum-=nums[i];
                i++;
            }
        }
        return length=(length==Integer.MAX_VALUE)?0:length;
      //  }else {return 0;}
    }
}