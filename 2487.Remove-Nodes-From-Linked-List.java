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
  // https://leetcode.com/submissions/detail/1250488820/
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stk = new Stack<>();
        while(head!=null) {
            int currVal = head.val;
            while(!stk.isEmpty() && stk.peek() < currVal) {
                stk.pop();
            }
            stk.push(currVal);
            head = head.next;
        }
        ListNode newNode = new ListNode(stk.pop());
        newNode.next = null;
        ListNode nNode = newNode;
        while(!stk.isEmpty()) {
            nNode = new ListNode(stk.pop());
            nNode.next = newNode;
            newNode = nNode;
        }
        return nNode;
    }
}
