/*
 * Solution to AddTwoNumbers problem
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    //Head of list to be returned
    ListNode head = new ListNode(0);
    ListNode current = head;

    int carry = 0;

    ListNode traversal1 = l1;
    ListNode traversal2 = l2;

    //Loop through both lists
    while (traversal1 != null || traversal2 != null) {
      int x = 0;
      if (traversal1 != null) {
        x = traversal1.val;
      }

      int y = 0;
      if (traversal2 != null) {
        y = traversal2.val;
      }

      int sum = carry + x + y;
      carry = sum / 10;

      current.next = new ListNode(sum % 10);

      current = current.next;

      if (traversal1 != null) {
        traversal1 = traversal1.next;
      }
      if (traversal2 != null) {
        traversal2 = traversal2.next;
      }
    }

    //If we still have a carry left over
    if (carry > 0) {
      current.next = new ListNode(carry);
    }

    //Exclude head when returning
    return head.next;
  }
}
