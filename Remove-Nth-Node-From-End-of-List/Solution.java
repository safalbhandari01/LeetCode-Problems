/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp2 = head;
        
        if(head == null){return head;}
        if(n==0){return head;}
        
        for(int i=0; i<n;i++){
            temp = temp.next;
        }
        if(temp==null){
            head = head.next;
            return head;
        }
        while(temp.next!=null){
            temp2= temp2.next;
            temp=temp.next;
        }
        
        ListNode deleteNode = temp2.next;
        temp2.next = temp2.next.next;
        
        return head;
    }
}
