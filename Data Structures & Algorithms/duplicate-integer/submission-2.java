class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

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
    }
}