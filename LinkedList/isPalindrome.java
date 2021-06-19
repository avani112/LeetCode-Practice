/*
Given the head of a singly linked list, return true if it is a palindrome.
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
       if(head==null) return true;
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        while(head!=null){
            l1.add(head.val);
            head=head.next;
        }
        for(int i = l1.size()-1;i>=0;i--)
        {
            l2.add(l1.get(i));
        }
        return l1.equals(l2);
    }
}