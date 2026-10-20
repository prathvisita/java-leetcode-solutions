class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return false;
        }
        String m=s.trim().toLowerCase();
        String k=m.replaceAll("[^a-z0-9]","");
        int i=0;
        int j=k.length()-1;
        while(i<j){
            if(k.charAt(i)==k.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}