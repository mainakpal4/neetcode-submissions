class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int[] arr=new int[temperatures.length];
        int c=0;

        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                    arr[st.peek()]=i-st.pop();
            }

            st.push(i);

        }

        return arr;
    }
}
