class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
     int i=0;
     int j=1;
     int length=1;
     int Maxlength=1;
     while(i<j&&j<s.length()){
        if(s.substring(i,j).indexOf(s.charAt(j))==-1){
             length++;
            if(length>Maxlength){
              Maxlength=length;
        }
            j++;
        }else{
            length=1;
            i++;
            j=i+1;
        }
     }
      return Maxlength;
    }
}