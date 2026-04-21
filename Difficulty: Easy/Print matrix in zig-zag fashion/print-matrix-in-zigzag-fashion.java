// User function Template for Java
class Solution {
    public List<Integer> zigZagMatrix(int[][] mat) {
        // Your code here
        
        List<Integer> res = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        
        for(int d=0;d<m+n-1;d++)
        {
            List<Integer> temp = new ArrayList<>();
            int r = (d < n)?0:d-n+1;
            int c = (d < n)?d:n-1;
            while(r<m && c>=0)
            {
                temp.add(mat[r][c]);
                r++;
                c--;
            }
            
            if(d%2==0)
            {
                Collections.reverse(temp);
            }
            res.addAll(temp);
        }
        return res;
    }
}