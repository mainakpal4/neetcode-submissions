class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),i);
        }

        int partition=0,end=0;
        List<Integer> ls=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            partition++;
            end=Math.max(end,hm.get(s.charAt(i)));
            if(i==end){
                ls.add(partition);
                partition=0;
            }
        }
        return ls;
    }
}
