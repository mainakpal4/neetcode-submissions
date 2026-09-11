class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int r=0,l=0;
        int arr[]=new int[nums.length-k+1];

        while(r<nums.length){
            while(!dq.isEmpty() && nums[dq.getLast()] < nums[r]){
                dq.pollLast();
            }
            dq.addLast(r);

            if(l>dq.getFirst()){
                dq.pollFirst();
            }

            if((r+1)>=k){
                arr[l]=nums[dq.getFirst()];
                l++;
            }
                r++;

        }
            return arr;
    }
}
