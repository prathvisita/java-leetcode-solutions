class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=needle.length();
        while(j<=haystack.length()){
            String result=haystack.substring(i,j);
            if(result.equals(needle)){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}