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
// https://leetcode.com/submissions/detail/1253002464/
class Solution {
  public ListNode doubleIt(ListNode head) {
    Stack < Integer > stk = new Stack < > ();
    while (head != null) {
      stk.push(head.val);
      head = head.next;
    }
    int carry = 0;
    ListNode ans = new ListNode();
    int val = 0;
    while (!stk.isEmpty()) {
      int curr = stk.pop();
      int dcurr = curr * 2 + carry;
      int nValue = dcurr % 10;
      carry = dcurr / 10;
      ListNode currNode = new ListNode(nValue);
      val++;
      if (val == 1) {
        currNode.next = null;
      } else {
        currNode.next = ans;
      }
      ans = currNode;
    }
    if (carry == 1) {
      ListNode carryNode = new ListNode(1);
      carryNode.next = ans;
      ans = carryNode;
    }
    return ans;

  }
}
