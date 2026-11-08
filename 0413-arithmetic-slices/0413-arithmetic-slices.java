class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3){
            return 0;

        }
        int i=0;
        int j=2;
        int count=0;
        while(j<nums.length){
                int k=j;
                while(k<nums.length&&nums[k]-nums[k-1]==nums[k-1]-nums[k-2]){
                    count++;
                    k++;
                }
             j++;
             i++;
        } 
            return count;
    }
}