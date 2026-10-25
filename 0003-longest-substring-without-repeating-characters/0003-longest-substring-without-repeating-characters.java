class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int i=0;
        int j=i+1;
        int count=1;
        int maxC=1;
        while(i<j&&j<s.length()){
            if(s.charAt(i)!=s.charAt(j)&&s.substring(i,j).indexOf(s.charAt(j))==-1){
                count++;
                if(count>maxC){
                    maxC=count;
                }
                j++;
            }else{
                count=1;
                i++;
                j=i+1;
            }
        }
        return maxC;
    }
}