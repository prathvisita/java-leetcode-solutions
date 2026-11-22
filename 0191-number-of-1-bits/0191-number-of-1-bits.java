class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int count=0;
        char a='1';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==a){
                count++;
            }
        }
        return count;
    }
}