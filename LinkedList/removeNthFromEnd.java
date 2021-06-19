/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode temp = new ListNode();
        temp.next=head;
        ListNode slow = temp;
        int i=0;
        while(i<n-1){
            fast=fast.next;// find nth node
            i++;
        }
        while(fast.next!=null){ 
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;// remove nth node
        return temp.next;
    }
}