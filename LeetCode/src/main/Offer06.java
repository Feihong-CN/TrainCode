package main;

import java.util.ArrayList;

public class Offer06 {
    public int[] reversePrint(ListNode head) {
        if (head==null)
            return new int[0];
        ArrayList<Object> objects = new ArrayList<>();
        ListNode p=head;
        while (p!=null){
            objects.add(p.val);
            p=p.next;
        }
        int len=objects.size();
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i]=(int)objects.get(len-1-i);
        }
        return res;
    }
}
