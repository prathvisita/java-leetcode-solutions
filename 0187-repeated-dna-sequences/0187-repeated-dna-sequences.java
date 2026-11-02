class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String>list=new HashSet<>();
        if(s==null||s.length()<=10){
            return new ArrayList<>();
        }
        HashMap<String , Integer>freq=new HashMap<>();
        int i=0;
        int j=10;
        while(j<=s.length()){
            String res=s.substring(i,j);
            if(freq.containsKey(res)){
                // if(!list.contains(res)){
                list.add(res);
                // }
            }
            freq.put(res,freq.getOrDefault(res,0)+1);
            i++;
            j++;
        }
        return new ArrayList<>(list);
    }
}