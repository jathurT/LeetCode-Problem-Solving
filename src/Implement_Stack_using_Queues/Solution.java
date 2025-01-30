package Implement_Stack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
  private final Queue<Integer> q1 = new LinkedList<>();
  private final Queue<Integer> q2 = new LinkedList<>();

  public MyStack() {

  }

  public void push(int x) {
    q1.add(x);
  }

  public int pop() {
    while (q1.size() > 1) {
      q2.add(q1.remove());
    }
    int result = q1.remove();
    while (!q2.isEmpty()) {
      q1.add(q2.remove());
    }
    return result;
  }

  public int top() {
    while (q1.size() > 1) {
      q2.add(q1.remove());
    }
    int result = q1.remove();
    q2.add(result);
    while (!q2.isEmpty()) {
      q1.add(q2.remove());
    }
    return result;

  }

  public boolean empty() {
    return q1.isEmpty();
  }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */