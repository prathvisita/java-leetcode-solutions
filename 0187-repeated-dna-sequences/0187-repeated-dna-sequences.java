class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String>list=new ArrayList<>();
        if(s==null||s.length()<=10){
            return list;
        }
        HashMap<String , Integer>freq=new HashMap<>();
        int i=0;
        int j=10;
        while(j<=s.length()){
            String res=s.substring(i,j);
            if(freq.containsKey(res)){
                if(!list.contains(res)){
                list.add(res);}
            }
            freq.put(res,freq.getOrDefault(res,0)+1);
            i++;
            j++;
        }
        return list;
    }
}