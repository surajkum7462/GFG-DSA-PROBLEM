/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Pair{
    public Node node;
    public int line;
    public Pair(Node node,int line)
    {
        this.node=node;
        this.line=line;
    }
}


class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
         ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<Pair>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair it= q.poll();
            int line=it.line;
            Node temp=it.node;
            
                map.put(line,temp.data);
            
            if(temp.left!=null)
            {
                q.offer(new Pair(temp.left,line-1));
            }
            if(temp.right!=null)
            {
                q.offer(new Pair(temp.right,line+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            ans.add(entry.getValue());
        }
        return ans;
        
    }
}