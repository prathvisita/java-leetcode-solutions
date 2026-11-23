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
    public ListNode deleteDuplicates(ListNode head) {
       // ListNode dummy=new ListNode(0);
       if(head==null||head.next==null){
        return head;
       }
        ListNode p1=head;
        ListNode p2=head.next;
        while(p2!=null){
            // if(p1.val!=p2.val){
            //     p1.next=p2;
            //     p2=p2.next;
            //     p1=p1.next;
            // }else if(p1.val==p2.val){
            //     p2=p2.next;
            // }
            if(p1.val==p2.val){
                p2=p2.next;
                p1.next=p2;
            }else{
                p2=p2.next;
                p1=p1.next;
            }
        }
        // p1.next=null;
        return head;
    }
}