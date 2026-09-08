class Solution {
    public int lengthOfLastWord(String s) {
        String newS=s.trim();
       StringBuilder sb=new StringBuilder();
      // int count=0;
      // String result="";
        // if(newS.length()==1){
        //     return 1;
        // }
       for(int i=newS.length()-1;i>=0;i--){
        if(newS.charAt(i)==' '){
            //return count;
            break;
        }
          sb.append(newS.charAt(i));
       }
        return sb.length();
    }
}