/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode Tortorise = head;
        ListNode Hare = head;
        while(Hare != null && Hare.next != null){
            Tortorise =Tortorise.next;
            Hare = Hare.next.next;
            if(Tortorise == Hare) return true;
        }
        return false;
    }
}