/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode nextnode;
        ListNode prevnode=null;
        while(head!=null){
            nextnode = head.next;
            head.next=prevnode;
            prevnode=head;
            head=nextnode;
        }
     return prevnode;   
    }
}