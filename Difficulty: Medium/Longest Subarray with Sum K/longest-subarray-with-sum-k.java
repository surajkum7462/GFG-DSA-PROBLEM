// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
             prefixSum+=arr[i];
             if(prefixSum==k)
             {
                 max=i+1;
             }
             if(map.containsKey(prefixSum-k))
             {
                 max=Math.max(max,i-map.get(prefixSum-k));
             }
             if(!map.containsKey(prefixSum))
             {
                 map.put(prefixSum,i);
             }
            
        }
        return max;
    }
}
