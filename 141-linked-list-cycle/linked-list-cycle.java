/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null) return false;
        ListNode fast = head.next.next;
        ListNode slow = head;
        while(fast!=null&&slow!=null)
        {
            if(fast==slow)
            {
                return true;
            }
            if(fast!=null&&fast.next!=null&&fast.next.next!=null) fast = fast.next.next;
            else return false;
            if(slow!=null&&slow.next!=null) slow = slow.next;
            else return false;
        }

        return false;
    }
}