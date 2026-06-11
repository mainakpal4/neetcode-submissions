class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();

        for(int i:nums)
        hm.add(i);

        if(hm.size()!=nums.length)
        return true;
        else 
        return false;
    }
}