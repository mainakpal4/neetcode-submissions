class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int j=k-1;
        // int ans[]=new int[nums.length-k+1];
        // for(int i=0;i<nums.length-k+1;i++){
        //     int max=Integer.MIN_VALUE;
        //     j=i+k-1;
        //     while(j>=i){
        //         max=Math.max(max,nums[j]);
        //         j--;
        //     }
        //     ans[i]=max;
        // }

        // return ans;
        int n=nums.length;
        int ans[]=new int[n-k+1];
        int l=0,r=0;
        Deque<Integer> q=new LinkedList<>();

        while(r<n){
            while(!q.isEmpty() && nums[q.getLast()]<nums[r]){
                q.removeLast();
            }
            q.addLast(r);
            if(l>q.getFirst()){
                q.removeFirst();

            }

            if((r+1)>=k){
                ans[l]=nums[q.getFirst()];
                l++;
            }
            r++;
        }

        return ans;
    }
}
