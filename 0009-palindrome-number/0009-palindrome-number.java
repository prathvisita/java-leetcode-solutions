class Solution {
    public boolean isPalindrome(int x) {
        int reversed=0;
        int original=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int rem=x%10;
            reversed=reversed*10+rem;
            x/=10;
        }
        if(original==reversed){
            return true;
        }else{
            return false;
        }
    }
}