class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int j=k-1;
        int ans[]=new int[nums.length-k+1];
        for(int i=0;i<nums.length-k+1;i++){
            int max=Integer.MIN_VALUE;
            j=i+k-1;
            while(j>=i){
                max=Math.max(max,nums[j]);
                j--;
            }
            ans[i]=max;
        }

        return ans;
    }
}
