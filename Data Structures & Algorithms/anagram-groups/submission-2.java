class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hm=new HashMap<>();
        // List<List<String>> ls=new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            String st=strs[i];
            char[] ch= st.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            hm.putIfAbsent(key,new ArrayList<>());
            hm.get(key).add(st);

        }

         return new ArrayList<>(hm.values());
    }
}
