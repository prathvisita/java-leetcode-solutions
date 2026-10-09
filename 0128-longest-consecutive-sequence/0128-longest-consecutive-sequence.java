class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int count=1;
        int maxC=1;
        for(int i=1;i<nums.length;i++){
        //   int count=1;
          int val=nums[i-1]+1;
          if(nums[i]==val){
            count++;
          }else if(nums[i]>val){
            count=1;
          }
        //   
        maxC=Math.max(maxC,count);
        }
        return maxC;
    }
}