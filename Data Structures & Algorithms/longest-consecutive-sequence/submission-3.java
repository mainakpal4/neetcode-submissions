class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1)return nums.length;
        Arrays.sort(nums);
        int max=1,count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
            continue;
            if(nums[i]+1==nums[i+1]){
                count++;
            }
            else count=1;
            max=Math.max(max,count);
        }
        return max;
    }
}
