class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int maxlen=0;
        HashSet<Character> hs= new HashSet<>();

        while(j<s.length()){
            
            while(hs.contains(s.charAt(j))){
                hs.remove(s.charAt(i));
                i++;
            }
            
            hs.add(s.charAt(j));
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
    
        return maxlen;
    }

}
