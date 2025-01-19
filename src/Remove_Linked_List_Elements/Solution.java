package Remove_Linked_List_Elements;

public class Solution {
  public ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0);  // dummy node to check the head is null or not
    dummy.next = head;
    ListNode current = dummy;
    while (current.next != null) {
      if (current.next.val == val) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
    return dummy.next;
  }
}