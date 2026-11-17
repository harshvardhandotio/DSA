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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        ListNode tail=head;
        int len=1;
        while(tail.next!=null){
            tail=tail.next;
            len++;
        }
        if(k%len==0){
            return head;
        }
        k=k%len;
        tail.next=head;
        ListNode newnode=findnthnode(head,len-k);
        head=newnode.next;
        newnode.next=null;
        return head;
        
        
    }
    public ListNode findnthnode(ListNode head,int k){
        int cnt=1;
        ListNode temp=head;
        while(temp!=null){
            if(cnt==k){
                return temp;
            }
            cnt++;
            temp=temp.next;
        }
        return temp;
    }
}