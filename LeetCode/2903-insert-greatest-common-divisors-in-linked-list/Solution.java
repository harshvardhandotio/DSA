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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node1 = head;
        ListNode node2 = head.next;

        while (node2 != null) {
            int gcdvalue = gcd(node1.val, node2.val);
            ListNode gcd = new ListNode(gcdvalue);//here also we can write(gcdvalue,node2)
            node1.next = gcd;
            gcd.next = node2;

            node1 = node2;
            node2 = node2.next;

        }
        return head;
    }

    private int gcd(int a, int b) {
        int gcd=1;
        int n=Math.min(a,b);
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;

    }

}