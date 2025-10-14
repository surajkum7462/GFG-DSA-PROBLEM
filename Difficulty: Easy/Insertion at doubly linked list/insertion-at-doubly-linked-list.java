/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        // code here
        Node ele = new Node(x);
        if(head==null)
        {
            return ele;
        }
        Node temp = head;
        int i=0;
        while(i<p)
        {
            temp=temp.next;
            i++;
        }
        
        if(temp.next!=null)
        {
            ele.next=temp.next;
            ele.next.prev=ele;
            temp.next=ele;
            ele.prev=temp;
        }
        else
        {
            temp.next=ele;
            ele.prev=temp;
        }
        return head;
    }
}