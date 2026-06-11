class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int k= target;
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(k-nums[i])){
                hm.put(nums[i],i);
            }
            else{
                return new int[] { hm.get(k - nums[i]), i };
            }

    }
    return null;
    }
}
