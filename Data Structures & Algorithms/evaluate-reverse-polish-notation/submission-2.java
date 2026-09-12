class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();

        for(String c:tokens){
            if(c.equals("+") && !st.isEmpty()){
                int t=(st.pop());
                int s=(st.pop());
                st.push(t+s);
            }
            else if(c.equals("-") && !st.isEmpty()){
                int t=(st.pop());
                int s=(st.pop());
                st.push(s-t);
            }
            else if(c.equals("*") && !st.isEmpty()){
                int t=(st.pop());
                int s=(st.pop());
                st.push(s*t);
            }
            else if(c.equals("/") && !st.isEmpty()){
                int t=(st.pop());
                int s= (st.pop());
                st.push(s/t);
            }
            else if(c.equals("^") && !st.isEmpty()){
                int t= (st.pop());
                int s= (st.pop());
                st.push((int)Math.pow(s,t));
            }
            else{
                st.push(Integer.parseInt(c));
            }


        
        }

        return st.pop();
    }
}
