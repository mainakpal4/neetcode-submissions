class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        // HashMap<Integer,Integer> ht = new HashMap<>();

        // for(int i:nums)
        // hm.add(i);

        // if(hm.size()!=nums.length)
        // return true;
        // else 
        // return false;

        for(int i:nums){
            if(hs.contains(i)){
                return true;
            }
            else
            hs.add(i);
        }
        return false;

        // for(int i=0;i<nums.length;i++){
        //     if(ht.containsKey(nums[i])==false){
        //         ht.put(nums[i],1);
        //     }
        //     else
        //     return true;
        // }
        
        // return false;
    }
}