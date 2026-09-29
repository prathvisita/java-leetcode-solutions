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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d=new ListNode(0);
        ListNode c=d;
        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null&&p2!=null){
            if(p1.val<=p2.val){
                c.next=p1;
                c=c.next;
                p1=p1.next;
            }else{
                c.next=p2;
                c=c.next;
                p2=p2.next;
            }
        }
        if(p1==null){
            c.next=p2;
            c=c.next;
        }else{
            c.next=p1;
            c=c.next;
        }
        return d.next;
    }
}