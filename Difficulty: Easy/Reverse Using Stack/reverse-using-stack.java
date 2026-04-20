class Solution {
    public String reverse(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        if(s==null)
        {
            return null;
        }
        s=s.trim();
        for(char ch : s.toCharArray())
        {
            st.push(ch);
        }
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.toString();
    }
}