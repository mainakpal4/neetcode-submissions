class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int l=0,maxf=0,res=0;

        for(int r=0;r<s.length();r++){ // r=i
        count.put(s.charAt(r),count.getOrDefault(s.charAt(r), 0)+1);
        maxf= Math.max(maxf,count.get(s.charAt(r)));

        while((r-l+1) - maxf > k){
            count.put(s.charAt(l),count.get(s.charAt(l))-1);
            l++;
        }
        res=Math.max(res,r-l+1);
        }

        return res;
    }
}

// class Solution {
//     public int characterReplacement(String s, int k) {
        
//         int l=0,max=0,count=0;

//         for(int i=1;i<s.length();i++){ // r=i
//             if(s.charAt(i) != s.charAt(l))
//             count++;
            
//             if(count>k){
//                 if(s.charAt(l)!=s.charAt(i))
//                 count--;
//             l++;
              
//             }
//             max=Math.max(i-l+1,max);
//         }

//         return max;
//     }
// }

