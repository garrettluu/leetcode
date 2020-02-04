/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode swapPairs(ListNode head) {
    ListNode currNode = head;

    if (head == null) {
      return head;
    }

    ListNode newHead = head.next;

    if (newHead == null) {
      return head;
    }

    while (currNode != null) {
      if (currNode.next == null) {
        break;
      }

      ListNode nextNode = currNode.next;
      currNode.next = nextNode.next;
      nextNode.next = currNode;

      currNode = currNode.next;

      if (currNode != null && currNode.next != null) {
        nextNode.next.next = currNode.next;
      }
    }
    return newHead;
  }
}
