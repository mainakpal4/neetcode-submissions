class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ls=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            // int req=-nums[i];
            if(nums[i]>0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int j=i+1;
            int k=nums.length-1;
            while(j<k && j<nums.length && k>=i){
                if(nums[j]+nums[k]+nums[i]>0){
                    k--;
                }
                else if(nums[j]+nums[k]+nums[i]<0){
                    j++;
                }
                else{
                    ls.add(List.of(nums[i],nums[j],nums[k]));
                
                j++;
                k--;

                while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
            }}

        }

        return ls;
    }
}
