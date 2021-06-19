/*
Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
		StringBuilder s = new StringBuilder();
		while (head != null) {
			s.append(head.val);
			head = head.next;
		}
        int result=0;
        int num = 0;
		int factor = 1;
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			if (c == '1') {
				num = factor;
			}
			result += num;
			num = 0;
			factor *= 2;
		}
        return result;
    }
}