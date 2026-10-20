class Solution {
    private boolean isVowel(char c){
        char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<vowel.length;i++){
            if(c==vowel[i]){
                return true;
            }
        }
       return false;
    }
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            char a=sb.charAt(i);
            char b=sb.charAt(j);
            if(isVowel(a)&&isVowel(b)){
              sb.setCharAt(i,b);
              sb.setCharAt(j,a);
              i++;
              j--;
            }else if(isVowel(a)==false&&isVowel(b)==true){
                i++;
            }else if(isVowel(a)==true&&isVowel(b)==false){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}