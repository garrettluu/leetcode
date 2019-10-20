/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    }
    ListNode result;
    if (l1.val > l2.val) {
      result = new ListNode(l2.val);
      result.next = mergeTwoLists(l1, l2.next);
    } else {
      result = new ListNode(l1.val);
      result.next = mergeTwoLists(l1.next, l2);
    }
    return result;
  }
}
