class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int i=0;
        int j=1;
        int count=1;
        int maxC=1;
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(j)&&s.substring(i,j).indexOf(s.charAt(j))==-1){
                count++;
                j++;
            }else{
                i++;
                count=1;
                j=i+1;
            }
            if(count>maxC){
                maxC=count;
            }
        }
        return maxC;
    }
}