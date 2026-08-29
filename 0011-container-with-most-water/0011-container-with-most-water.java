class Solution {
    public int maxArea(int[] height) {
        int maxWater=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int area=Math.min(height[l],height[r])*(r-l);
            if(area>maxWater){
                maxWater=area;
            }
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }
        }
        return maxWater;
    }
}