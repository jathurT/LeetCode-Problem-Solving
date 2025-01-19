package Add_Two_Numbers;


class Solution {

  public int getNumber(ListNode l) {
    int number = 0;
    int multiplier = 1;
    while (l != null) {
      number += l.val * multiplier;
      multiplier *= 10;
      l = l.next;
    }
    return number;
  }

  public ListNode getLinkedList(int num) {
    ListNode dummy = new ListNode();
    ListNode current = dummy;
    while (num != 0) {
      current.next = new ListNode(num % 10);
      num /= 10;
      current = current.next;
    }
    return dummy.next;
  }


  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//    Approach 1
//    ==============================
//    ListNode dummy = new ListNode(0);
//    ListNode current = dummy;
//    int carry = 0;
//    while (l1 != null || l2 != null) {
//      int sum = carry;
//      if (l1 != null) {
//        sum += l1.val;
//        l1 = l1.next;
//      }
//      if (l2 != null) {
//        sum += l2.val;
//        l2 = l2.next;
//      }
//      carry = sum / 10;
//      current.next = new ListNode(sum % 10);
//      current = current.next;
//    }
//    if (carry > 0) {
//      current.next = new ListNode(carry);
//    }
//    return dummy.next;

//    Approach 2
//    ===========================================

    int num1 = getNumber(l1);
    int num2 = getNumber(l2);
    return getLinkedList(num1 + num2);

  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    ListNode list = solution.addTwoNumbers(new ListNode(5), new ListNode(0));
    while (list != null) {
      System.out.print(list.val + " ");
      list = list.next;
    }
  }
}