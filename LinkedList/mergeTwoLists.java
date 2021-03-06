/*
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists
 */
class Solution {
   public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		ListNode result = l1.val < l2.val ? l1 : l2; // finds the smaller value 
		result.next = mergeTwoLists(result.next, l1.val < l2.val ? l2 : l1); // recursive
		return result;
	}
}