/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode currentNode = node;
        ListNode nextNode = node.next;
        currentNode.next = nextNode.next;
        currentNode.val = nextNode.val;
        nextNode.next = currentNode; 
        
    }
}
