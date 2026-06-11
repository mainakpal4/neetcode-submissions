class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int k=0,pdt=1;

        for(int i=0;i<nums.length;i++){
            pdt=1;
            for(int j=0;j<nums.length;j++){
                    if(i==j)
                    continue;
                    pdt*=nums[j];
            }
            ans[k++]=pdt;
        }
        return ans;
    }
}  
