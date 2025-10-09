class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        boolean[] dp=new boolean[sum+1];
        
        dp[0]=true;
        
        for(int num:arr)
        {
            for(int j=sum;j>=num;j--)
            {
                if(dp[j-num])
                {
                    dp[j]=true;
                }
            }
        }
        return dp[sum];
        
    }
}