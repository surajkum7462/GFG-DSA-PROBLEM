class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        ArrayList<String> result = new ArrayList<>();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        
        backtrack(arr,used,new StringBuilder(),result);
        return result;
        
    }
    
    public void backtrack(char[] arr , boolean[] used , StringBuilder curr , ArrayList<String> result)
    {
        if(curr.length()==arr.length)
        {
            result.add(curr.toString());
            return;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(used[i]) continue;
            if(i>0 && arr[i]==arr[i-1] && !used[i-1]) continue;
            
            used[i]=true;
            curr.append(arr[i]);
            backtrack(arr,used,curr,result);
            
            used[i]=false;
            curr.deleteCharAt(curr.length()-1);
            
            
            
            
        }
    }
}