/*
Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.
*/
//sol 1
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode node1 = head;
        ListNode node2 = head;
	    while(node2!=null && node2.next!=null) {
            node2 = node2.next.next;
		    node1 = node1.next;
	    }
        
	return node1;
    }
}

// sol 2
class Solution {
    public ListNode middleNode(ListNode head) {
        
	ListNode node = head;
	int size = 0;
	while(node!=null) {
		size++;
		node = node.next;
	}

	int mid = (size/2) + 1;
	while(mid>1) {
		head=head.next;
		mid--;
	}

	return head;
    }
}