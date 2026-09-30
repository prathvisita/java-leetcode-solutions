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
    public boolean isPalindrome(ListNode head) {
        ListNode p1=head;
        ListNode p2=head;

        while(p2!=null&&p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        ListNode prev=null;
        ListNode curr=p1;

        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode pointer1=head;
        ListNode pointer2=prev;
        while(pointer2!=null){
            if(pointer1.val!=pointer2.val){
                return false;
            }
            pointer1=pointer1.next;
            pointer2=pointer2.next;
        }
        return true;
    }
}