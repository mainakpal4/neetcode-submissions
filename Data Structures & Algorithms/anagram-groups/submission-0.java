class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            int count[]=new int[26];

            for(char c:strs[i].toCharArray()){
                count[c-'a']++;
            }

          String s= Arrays.toString(count);

            hm.putIfAbsent(s,new ArrayList<>());
            hm.get(s).add(strs[i]);

        }
        return new ArrayList<>(hm.values());
    }
}
