/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode dummy = result;
        int rem=0;
        while(l1.next!=null || l2.next!=null){
            int carry=rem;
            if (l1 == null) {
				carry = carry + l2.val;
				l2 = l2.next;

			} else if (l2 == null) {
				carry = carry + l1.val;
				l1 = l1.next;

			} else {

				carry = carry + l1.val + l2.val;
				l1 = l1.next;
				l2 = l2.next;
			}

			if (carry < 10) {
				dummy.next = new ListNode(carry);
				dummy = dummy.next;
                rem = 0;
			} else {
				dummy.next = new ListNode(carry % 10);
				dummy = dummy.next;
                rem = 1;
			}
        }
        return result;
    }
}