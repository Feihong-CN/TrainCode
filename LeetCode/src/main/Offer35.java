package main;

import java.util.HashMap;

public class Offer35 {
    public Node copyRandomList(Node head){
        if (head==null)
            return null;
        HashMap<Node, Node> hashMap = new HashMap<>();
        Node cur=head;
        while (cur!=null){
            hashMap.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        while (cur!=null){
            hashMap.get(cur).next=hashMap.get(cur.next);
            hashMap.get(cur).random=hashMap.get(cur.random);
            cur=cur.next;
        }
        return hashMap.get(head);
    }
}
