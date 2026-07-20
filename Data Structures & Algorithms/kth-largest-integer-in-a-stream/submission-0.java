class KthLargest {
    ArrayList<Integer> arr=new ArrayList<>();
    int num=0;


    public KthLargest(int k, int[] nums) {
        for(int i:nums){
            arr.add(i);
        }
        num=k;
    }
    
    public int add(int val) {
        int n=arr.size();
        arr.add(val);
        Collections.sort(arr);
        return arr.get(arr.size()-num);

        
    }
}
