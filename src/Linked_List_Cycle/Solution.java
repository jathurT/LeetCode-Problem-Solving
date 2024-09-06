package Linked_List_Cycle;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//Definition for singly-linked list.
class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

// Time complexity: O(n)
public class Solution {
  public boolean hasCycle(ListNode head) {
    ListNode current = head;
    List<ListNode> pointers = new ArrayList<>();
    while (current != null && !pointers.contains(current)) {
      pointers.add(current);
      current = current.next;
    }
    return current != null;
  }
}

// Time complexity: O(n)
class Solution1{
  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode slow = head;
    ListNode fast = head.next;
    while (slow != fast) {
      if (fast == null || fast.next == null) {
        return false;
      }
      slow = slow.next;
      fast = fast.next.next;
    }
    return true;
  }
}