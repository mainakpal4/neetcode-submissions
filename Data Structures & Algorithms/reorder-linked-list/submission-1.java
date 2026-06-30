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
    public void reorderList(ListNode head) {

        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode midhead=slow.next;

        ListNode curr= midhead;
        ListNode prev=slow.next=null;

         

        while(curr!=null){
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }


        ListNode revHead=prev;

        // Merge two halves
        ListNode first = head;
        ListNode second = revHead;

        while (second != null) {

            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

                                // 2 actions here 
            first.next = second;// head pointing to revhead
            second.next = temp1;// revhead pointing to head.next

            first = temp1;// moving head 
            second = temp2;//moving revhead
        }

        return ;

    }
}
