class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        StringBuilder sb=new StringBuilder();
        String r=strs[0];
        for(int i=0;i<r.length();i++){
            char ch=r.charAt(i);
            for(int j=1;j<strs.length;j++){
               if (i == strs[j].length() || strs[j].charAt(i) != ch) {
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        String result=sb.toString();
        return result;
    }
}