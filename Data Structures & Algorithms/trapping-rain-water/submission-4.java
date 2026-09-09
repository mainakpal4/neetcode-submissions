class Solution {
    public int trap(int[] height) {

        if(height.length<=1) return 0;

        int[] premax=new int[height.length];
        int[] postmax=new int[height.length];

         premax[0] = height[0];
         postmax[height.length-1] = height[height.length-1];

        for(int i=1;i<height.length;i++){
            premax[i]=Math.max(premax[i-1],height[i]);
        }

         for(int i=height.length-2;i>=0;i--){
            postmax[i]=Math.max(postmax[i+1],height[i]);
        }
        int ans=0;

        for(int i=0;i<height.length;i++){
            ans+=(Math.min(premax[i],postmax[i])-height[i]);
        }

        return ans;


    }
}
