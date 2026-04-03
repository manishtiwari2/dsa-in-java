package leetcode.StackAndQueue.basicLearning;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void push(int x) {
        st1.push(x);
    }

    private void moveIfNeeded() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
    }

    public int pop() {
        moveIfNeeded();
        return st2.pop();
    }

    public int peek() {
        moveIfNeeded();
        return st2.peek();
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }

    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
        System.out.println(queue.pop());
        System.out.println(queue.empty());
    }
}


