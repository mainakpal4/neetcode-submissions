class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int ans=0;

        while(i<j && i<nums.length && j>=0){
            int area=(j-i)*Math.min(nums[j],nums[i]);

            if(nums[j]<nums[i]){
                j--;
            }
            else{ i++ ;}
           
            ans= Math.max(ans,area);
        }

        return ans;
    }
}
