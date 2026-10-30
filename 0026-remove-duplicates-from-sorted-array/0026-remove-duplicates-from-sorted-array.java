class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0||nums.length==1){
            return nums.length;
        }
        int k=1;
        for (int i=1;i<nums.length;i++){
            if(nums[i]!=nums[k-1]){
                int temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
        }
        return k;
    }
}