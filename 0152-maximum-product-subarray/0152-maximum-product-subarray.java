class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int maxp=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int p=nums[i];
            for(int j=i;j<nums.length;j++){
                if(j==i){
                   maxp=Math.max(maxp,p);
                }else{
                    p*=nums[j];
                    maxp=Math.max(maxp,p);
                }
            }
        }
        return maxp;
    }
}