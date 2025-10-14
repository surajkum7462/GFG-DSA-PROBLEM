/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node fast  = head;
        Node slow = head;
        int cnt=1;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                fast=fast.next;
                while(fast!=slow)
                {
                    cnt++;
                    fast=fast.next;
                }
                return cnt;
            }
        }
        return 0;
    }
}