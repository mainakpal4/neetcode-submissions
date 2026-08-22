class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;

        Map<Integer,Integer> hm=new HashMap<>();

        for(int i:hand){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        Arrays.sort(hand);

        for(int num:hand){
            if(hm.get(num)>0){
                for(int i=num;i<num + groupSize;i++){
                    if(hm.getOrDefault(i,0)==0) return false;
                    hm.put(i,hm.get(i)-1);
                }
            }
        }


        return true;
    }
}
