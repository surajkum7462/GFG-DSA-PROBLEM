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

class Solution {
    public int getTotalBurn(Node target,Map<Node,Node> parentMap)
    {
        int burn=0;
       
        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        q.offer(target);
        visited.add(target);
        while(!q.isEmpty())
        {
             boolean flag = false;
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                Node temp = q.poll();
                if(temp.left!=null && !visited.contains(temp.left))
                {
                    q.offer(temp.left);
                    visited.add(temp.left);
                    flag=true;
                }
                if(temp.right!=null && !visited.contains(temp.right))
                {
                    q.offer(temp.right);
                    visited.add(temp.right);
                    flag=true;
                }
                if(parentMap.containsKey(temp) && !visited.contains(parentMap.get(temp)))
                {
                     q.offer(parentMap.get(temp));
                     visited.add(parentMap.get(temp));
                    flag=true;
                }
            }
            if(flag)
            {
                burn++;
            }
        }
        return burn;
    }
    public Node findAndParent(Node root,int target,Map<Node,Node> parentMap)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node targetNode = null;
        while(!q.isEmpty())
        {
            Node node = q.poll();
            if(node.data==target)
            {
                targetNode = node;
            }
            if(node.left!=null)
            {
                parentMap.put(node.left,node);
                q.offer(node.left);
            }
            if(node.right!=null)
            {
                parentMap.put(node.right,node);
                q.offer(node.right);
            }
        }
        return targetNode;
    }
    public int minTime(Node root, int target) {
        // code here
        Map<Node,Node> parentMap = new HashMap<>();
        Node targetNode = findAndParent(root,target,parentMap);
        return getTotalBurn(targetNode,parentMap);
        
    }
}