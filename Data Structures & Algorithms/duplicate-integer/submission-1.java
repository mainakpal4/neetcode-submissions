// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         HashSet<Integer> hm = new HashSet<>();

//         for(int i:nums)
//         hm.add(i);

//         if(hm.size()!=nums.length)
//         return true;
//         else 
//         return false;
//     }
// }

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> ht= new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(ht.containsKey(nums[i])==false){
                ht.put(nums[i],1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}