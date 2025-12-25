class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> list = new TreeSet<>();
        for(int num:a)
        {
          list.add(num);
        }
        for(int num:b)
        {
            list.add(num);
        }
       
        return new ArrayList<>(list);
        
    }
}
