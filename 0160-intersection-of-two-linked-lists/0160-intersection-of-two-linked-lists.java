/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode L1 = headA;
        ListNode L2 = headB;
        while(L1 != L2){
            L1=(L1 == null)?headB :L1.next;
            L2=(L2 == null)?headA :L2.next;
        }
        return L1;
    }
}