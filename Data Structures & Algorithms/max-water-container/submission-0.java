class Solution {
    public int maxArea(int[] heights) {
        int l=0,h=heights.length-1;
        int max=0,a=0;
        while(l<h){
            a=(h-l)*Math.min(heights[l],heights[h]);
            max=Math.max(max,a);
            if(heights[l]<heights[h]){
                l++;
            }
            else h--;
        }
        return max;
    }
}
