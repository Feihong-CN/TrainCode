package main;

import java.util.LinkedList;

public class Offer30 {
    /** initialize your data structure here. */
    private LinkedList<Integer> stack1;
    private LinkedList<Integer> stack2;
    public Offer30() {
        stack1=new LinkedList<>();
        stack2=new LinkedList<>();
    }

    public void push(int x) {
        stack1.offer(x);
        if (stack2.isEmpty())
            stack2.offer(x);
        else{
            if (stack2.peekLast()>=x)
                stack2.offer(x);
        }
    }

    public void pop() {
        if (stack1.pollLast().equals(stack2.peekLast()))
            stack2.pollLast();
    }

    public int top() {
        return stack1.peekLast();
    }

    public int min() {
        return stack2.peekLast();
    }
}
