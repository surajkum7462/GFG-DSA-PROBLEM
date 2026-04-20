// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> st = new Stack<>();
        int n = pre_exp.length()-1;
        int i=0;
        while(i<=n)
        {
            char ch = pre_exp.charAt(n);
            if(Character.isLetterOrDigit(ch))
            {
                st.push(Character.toString(ch));
            }
            else
            {
                String ch1 = st.pop();
                String ch2 = st.pop();
                String ans = '('+ch1+ch+ch2+')';
                st.push(ans);
            }
            n--;
        }
        return st.peek();
    }
}
