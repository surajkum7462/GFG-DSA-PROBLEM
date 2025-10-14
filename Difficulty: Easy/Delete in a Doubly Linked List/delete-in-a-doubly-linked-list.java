/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
       Node curr = head;
        
        if(x==1)
        {
            Node newHead = head.next;
            curr.next=null;
            newHead.prev=null;
            return newHead;
        }
        
        
        int i=1;
        while(i<x)
        {
            curr=curr.next;
            i++;
        }
        
        if(curr==null)
        {
            return head;
        }
        
        if(curr.prev!=null)
        {
            curr.prev.next=curr.next;
            
        }
        if(curr.next!=null)
        {
            curr.next.prev=curr.prev;
            
        }
        return head;
        
    }
}