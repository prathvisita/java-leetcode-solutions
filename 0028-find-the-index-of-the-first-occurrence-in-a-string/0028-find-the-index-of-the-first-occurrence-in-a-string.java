class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        if(haystack.equals(needle)){
            return 0;
        }
        for(int i=0;i<=m-n;i++){
            String res=haystack.substring(i,i+n);
            if(res.equals(needle)){
                return i;
            }
        }
        return -1;

    }
}