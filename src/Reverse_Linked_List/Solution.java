package Reverse_Linked_List;

class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    while (current != null) {
      ListNode nextTemp = current.next;  // To memorize the next node without losing the connection
      current.next = prev;
      prev = current;
      current = nextTemp;
    }
    return prev;
  }
}