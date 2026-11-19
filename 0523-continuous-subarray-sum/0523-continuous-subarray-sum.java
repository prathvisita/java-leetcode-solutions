class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2){
            return false;
        }
        HashMap<Integer,Integer>s=new HashMap<>();
        s.put(0,-1);
        //  int[] sum=new int[nums.length];
        //  sum[0]=nums[0];
        // s.put(sum[0]%k,0);
        int rem=0;
        for(int i=0;i<nums.length;i++){
            rem=(rem+nums[i])%k;
            // int rem=sum[i]%k;
            if(s.containsKey(rem)){
                if(i-s.get(rem)>=2){
                    return true;
                }
            }else{
            s.put(rem,i); }  
            }
        return false;
    }
}