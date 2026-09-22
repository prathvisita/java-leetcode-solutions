class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int i=0;
        int j=1;
        int length=1;
        int maxL=1;
        while(i<j&&j<s.length()){
          if(s.charAt(i)!=s.charAt(j)&&s.substring(i,j).indexOf(s.charAt(j))==-1){
            length++;
            if(length>maxL){
                maxL=length;
            }
            j++;
          }else{
            length=1;
            i++;
            j=i+1;
          }

        }
        return maxL;
    }
}