package main;

import java.util.LinkedList;

public class Offer24 {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        ListNode p=new ListNode(-1);
        p.next=head;
        ListNode q=head.next;
        head.next=null;
        while (q!=null){
            ListNode r=q.next;
            q.next=p.next;
            p.next=q;
            q=r;
        }
        return  p.next;
    }
}
