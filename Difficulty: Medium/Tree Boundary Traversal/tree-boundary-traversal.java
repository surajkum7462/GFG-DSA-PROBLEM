/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isLeaf(Node node)
    {
        return node.left==null && node.right==null;
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(!isLeaf(root))
        {
            ans.add(root.data);
        }
        
        addLeftNode(root,ans);
        addLeafNode(root,ans);
        addRightNode(root,ans);
        
        return ans;
    }
    public void addLeftNode(Node node , ArrayList<Integer> ans)
    {
        Node curr = node.left;
        
        while(curr!=null)
        {
            if(!isLeaf(curr))
            {
                ans.add(curr.data);
            }
            if(curr.left!=null)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }
    }
    public void addRightNode(Node node , ArrayList<Integer> ans)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        Node curr = node.right;
        
        while(curr!=null)
        {
            if(!isLeaf(curr))
            {
                temp.add(curr.data);
            }
            if(curr.right!=null)
            {
                curr=curr.right;
            }
            else
            {
                curr=curr.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--)
        {
            ans.add(temp.get(i));
        }
    }
    public void addLeafNode(Node node , ArrayList<Integer> ans)
    {
        if (node == null) return;

        if (isLeaf(node)) {
            ans.add(node.data);
            return;
        }

        addLeafNode(node.left, ans);
        addLeafNode(node.right, ans);
    }
}