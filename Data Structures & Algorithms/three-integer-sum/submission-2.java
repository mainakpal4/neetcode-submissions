class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            // if(nums[i]>0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            List<Integer> s=new ArrayList<>();
            int l=i+1,h=nums.length-1;
            while(l<h){
                s=new ArrayList<>();
                if(nums[l]+nums[h]==-nums[i]){
                    s.add(nums[i]);
                    s.add(nums[l]);
                    s.add(nums[h]);
                    l++;
                    h--;
                }
                else if(nums[l]+nums[h]>-nums[i]){
                    h--;
                }
                else l++;

            if(!s.isEmpty() && !ls.contains(s)){
            // s.add()
            ls.add(s);
        }

            }
        
        }
        return ls;
    }
}
