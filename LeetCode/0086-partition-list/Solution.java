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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(0);
        ListNode large=new ListNode(0);

        ListNode smallhead=small;
        ListNode largehead=large;
        ListNode m=large.next;
        while(head!=null){
            if(head.val<x){
                smallhead.next=head;
                smallhead=smallhead.next;
            }
            else{
                largehead.next=head;
                largehead=largehead.next;
            }
            head=head.next;
        }
        largehead.next=null;
        smallhead.next=large.next;
        return small.next;
        
    }
}