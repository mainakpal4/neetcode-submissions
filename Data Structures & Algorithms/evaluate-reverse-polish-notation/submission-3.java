class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();

        for (String c : tokens) {

            switch (c) {

                case "+":
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b + a);
                    break;

                case "-":
                    int x = st.pop();
                    int y = st.pop();
                    st.push(y - x);
                    break;

                case "*":
                    int p = st.pop();
                    int q = st.pop();
                    st.push(q * p);
                    break;

                case "/":
                    int m = st.pop();
                    int n = st.pop();
                    st.push(n / m);
                    break;

                case "^":
                    int power = st.pop();
                    int base = st.pop();
                    st.push((int) Math.pow(base, power));
                    break;

                default:
                    st.push(Integer.parseInt(c));
            }
        }

        return st.pop();
    }
}