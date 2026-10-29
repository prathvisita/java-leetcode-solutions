class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int j:nums){
            if(freq.get(j)>(nums.length/3)&&l.contains(j)!=true){

                l.add(j);
            }
        }
        return l;
    }
}