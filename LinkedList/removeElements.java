/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        if(head.val == val) return removeElements(head.next, val);
        ListNode result=head;
        while(head.next!=null){
            if(head.next.val==val) head.next=head.next.next;
            else head=head.next;
        }
        return result;
    }
}