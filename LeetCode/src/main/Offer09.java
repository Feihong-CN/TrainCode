package main;

import java.util.LinkedList;

public class Offer09 {
    private LinkedList<Integer> stack1;
    private LinkedList<Integer> stack2;

    public Offer09() {
        stack1=new LinkedList<>();
        stack2=new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.offer(value);
    }

    public int deleteHead() {
        if(stack2.isEmpty()){
            if (stack1.isEmpty())
                return -1;
            else{
                int size=stack1.size();
                for (int i = 0; i < size; i++) {
                    stack2.offer(stack1.pollLast());
                }
            }
        }
        return stack2.pollLast();
    }
}
