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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // if(l1==null&&l2==null){
        //     return 0;
        // }
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        ListNode p1=l1;
        ListNode p2=l2;
        int carry=0;
        while(p1!=null||p2!=null||carry!=0){
           int val1;
           int val2;
           if(p1!=null){
            val1=p1.val;
           }else{
            val1=0;
           }
           if(p2!=null){
            val2=p2.val;
           }else{
            val2=0;
           }
           int sum=val1+val2+carry;
           int save=sum%10;
           carry=sum/10;
            ListNode newNode=new ListNode(save);
            cur.next=newNode;
            cur=cur.next;
            if(p1!=null){
                p1=p1.next;
            }
             if(p2!=null){
                p2=p2.next;
            }
        }
        return dummy.next;
    }
}