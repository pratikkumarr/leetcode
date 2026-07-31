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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
            count++;
        }
        for(int i=0; i<count/2; i++){
            if(head.val!=stack.pop()) return false;
            head = head.next;
        }
        return true;
    }
}