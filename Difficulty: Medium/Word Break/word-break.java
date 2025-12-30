class Solution {
    public boolean wordBreak(String s, String[] dictionary) {
        // code here
        Set<String> st = new HashSet<>();
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0]=true;
        
        for(String str:dictionary)
        {
            st.add(str);
        }
        
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(dp[j] && st.contains(s.substring(j,i)))
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
        
    }
}