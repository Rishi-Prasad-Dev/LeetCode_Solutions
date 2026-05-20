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
    public ListNode detectCycle(ListNode head) {
        ListNode Tortorise = head;
        ListNode Hare = head;
        while(Hare != null && Hare.next != null){
            Tortorise =Tortorise.next;
            Hare = Hare.next.next;

            if(Tortorise == Hare){
                Tortorise = head;
                while(Tortorise != Hare){
                    Tortorise= Tortorise.next;
                    Hare=Hare.next;
                }
                if(Tortorise == Hare )return Tortorise;
            }
        }
        return null;
    }
}