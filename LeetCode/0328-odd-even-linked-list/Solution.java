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
    public ListNode oddEvenList(ListNode head) {
         if(head==null || head.next==null){
             return head;
         }
        // List<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // while (temp != null && temp.next != null) {//2nd cond in while is not imp
        //     arr.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp!=null){
        //     arr.add(temp.val);//this we are writing for last element
        // }
        // temp=head.next;
        // while(temp!=null && temp.next!=null){
        //     arr.add(temp.val);
        //     temp=temp.next.next;

        // }
        // if(temp!=null){
        //     arr.add(temp.val);
        // }
        // int i=0;
        // temp=head;
        // while(temp!=null){
        //     temp.val=arr.get(i);
        //     i++;
        //     temp=temp.next;
        // }
        // return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=head.next;
        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;

        }
        odd.next=evenhead;
        return head;

    }
}