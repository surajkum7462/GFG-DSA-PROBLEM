/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Pair {
    Node node;
    int line;
    public Pair(Node node,int line)
    {
        this.node=node;
        this.line=line;
    }
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair it = q.poll();
            Node temp = it.node;
            int line = it.line;
            if(map.get(line)==null)
            {
                map.put(line,temp.data);
            }
            if(temp.left!=null)
            {
                q.offer(new Pair(temp.left,line-1));
            }
            if(temp.right!=null)
            {
                q.offer(new Pair(temp.right,line+1));
            }
        }
        for(Map.Entry<Integer,Integer> key:map.entrySet())
        {
            ans.add(key.getValue());
        }
        return ans;
        
    }
}