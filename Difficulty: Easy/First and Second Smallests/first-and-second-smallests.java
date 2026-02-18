import java.util.*;

class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int smallest = Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int num : arr)
        {
            if(num<smallest)
            {
                secondSmallest=smallest;
                smallest=num;
            }
            else if(num>smallest && num<secondSmallest)
            {
                secondSmallest=num;
            }
        }
        if(secondSmallest==Integer.MAX_VALUE)
        {
            return new ArrayList<>(Arrays.asList(-1));
        }
         ans.add(smallest);
        ans.add(secondSmallest);
        return ans;
    }
}
