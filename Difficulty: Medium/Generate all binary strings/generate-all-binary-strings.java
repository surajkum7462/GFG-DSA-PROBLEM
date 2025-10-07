class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> res = new ArrayList<>();
        generateString(n,"",res);
        return res;
    }
    public void generateString(int n , String curr , ArrayList<String> res)
    {
        if(curr.length()==n)
        {
            res.add(curr);
            return;
        }
        generateString(n,curr+"0",res);
        if(curr.isEmpty() || curr.charAt(curr.length()-1)!=1)
        {
            generateString(n,curr+"1",res);
        }
    }
}
