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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res=new ListNode[k];
        int length=0;
        ListNode curr=head;
        // 1 2 3 4 5 6 7 8 9 10 11
        //len=11;
        //size=2;
        // 2 2 2 2
        //rem=3;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        int splitsize=length/k;
        int remainsize=length%k;
        // 1 2 3 4 5 6 7 8 9 10 11
        // a
        //     p
        //       c
        //len=11;
        //size=2;
        // 2 2 2 2
        //rem=3;
        ListNode newcurr=head;
        ListNode prev=null;
        for(int i=0;i<k;i++){
            ListNode ans=newcurr; 
            int size=splitsize;//new start on new loop
            if(remainsize>0){
                size++;
                remainsize--;
            }
            int j=0;
            while(j<size){
                j++;
                prev=newcurr;//newcurr ke just baad prev chahiye
                newcurr=newcurr.next;
            }
            if(prev!=null){
                prev.next=null;
            }
            //prev.next=null;//ese not working..
            res[i]=ans;
        }
        return res;
    }
}