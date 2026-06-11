class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> hm= new HashMap<>();
        int ans[]=new int[k];
        int j=0;
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
            // if(hm.containsKey(num))
            // hm.put(num,hm.get(num)+1);
            // else 
            // hm.put(num,0);
            // if(hm.get(num)>=k){
            //     ans[j++]=num;
            // }
        }
        
        List<Integer> list = new ArrayList<>(hm.keySet());
        list.sort((a, b) -> hm.get(b) - hm.get(a));
        
        for(int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}
