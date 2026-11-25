class NumArray {
    int[] a;
    public NumArray(int[] nums) {
       this.a=nums;
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        while(left<=right){
            sum+=a[left];
            left++;
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */