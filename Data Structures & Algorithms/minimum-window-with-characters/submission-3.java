class Solution {
    public String minWindow(String s, String t) {

        if(t.isEmpty()) return null;
        HashMap<Character,Integer> hmt=new HashMap<>();
        HashMap<Character,Integer> wd=new HashMap<>();

        for(char c:t.toCharArray()){
            hmt.put(c,hmt.getOrDefault(c,0)+1);
        }
        // for(int i=0;i<t.length();i++){
        //     hms.add(s.charAt(i),hms.getOrDefault(s.charAt(i),0)+1);
        // }

        // if(hmt.equals(hms))return t;
        // int l=0;

        int have=0;
        int need=hmt.size();

        int res[]=new int[2];
        int reslen=Integer.MAX_VALUE;
        int l=0;

        for(int r=0;r<s.length();r++){
          wd.put(s.charAt(r),wd.getOrDefault(s.charAt(r),0)+1);
          if(hmt.containsKey(s.charAt(r)) && hmt.get(s.charAt(r)).equals(wd.get(s.charAt(r))) )have ++;
          
         while(have == need){
            
    if (r - l + 1 < reslen) {
        reslen = r - l + 1;
        res[0] = l;
        res[1] = r;
    }

    wd.put(s.charAt(l), wd.get(s.charAt(l)) - 1);
    
            if(hmt.containsKey(s.charAt(l)) && wd.get(s.charAt(l))<hmt.get(s.charAt(l)))
            have--;

            l++;

            
          }



        }

        return reslen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);

    }
}
