class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> l=new ArrayList<>();
        int n=digits.length-1;
        int carry=1;
        for(int i=n;i>=0;i--){
          int sum=digits[i]+carry;
          l.add(sum%10);
          carry=sum/10;
        }
        if(carry>0){
         l.add(carry);
        }
        Collections.reverse(l);
      int size=l.size();
      int[] res=new int[size];
      for(int i=0;i<l.size();i++){
         res[i]=l.get(i);
      }
      return res;
    }
}