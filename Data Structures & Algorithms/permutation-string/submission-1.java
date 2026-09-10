class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> hm=new HashMap<>();
        Map<Character,Integer> hm2=new HashMap<>();

        for(char c:s1.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int l=0;

        for(int r=0;r<s2.length();r++){
            hm2.put(s2.charAt(r),hm2.getOrDefault(s2.charAt(r),0)+1);

            

            // Keep window size equal to s1.length()

            if( (r - l + 1) > s1.length()) {
                hm2.put(
                    s2.charAt(l),
                    hm2.get(s2.charAt(l)) - 1
                );
                if (hm2.get(s2.charAt(l)) == 0) {
                    hm2.remove(s2.charAt(l));
                }
                l++;
            }

            if(hm2.equals(hm))
            return true;

        }
    
        return false;
    }
}
