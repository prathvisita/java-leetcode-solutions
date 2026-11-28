class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        int j=needle.length()-1;
        while(j<haystack.length()){
            String comp=haystack.substring(i,j+1);
            if(comp.equals(needle)){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}