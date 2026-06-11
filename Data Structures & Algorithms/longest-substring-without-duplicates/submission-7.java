class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,res=0;
        HashSet<Character> hs=new HashSet<>();

        for(int i=0;i<s.length();i++){
            while(hs.contains(s.charAt(i))){
               hs.remove(s.charAt(l));
                l++;
           }
            hs.add(s.charAt(i));
            res=Math.max(res,i-l+1); //here i is actualyy r right
            
        }
        return res;
    }
}
