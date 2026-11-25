class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int maxp=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int p=1;
            for(int j=i;j<nums.length;j++){
                    p*=nums[j];
                    maxp=Math.max(maxp,p);
            }
        }
        return maxp;
    }
}