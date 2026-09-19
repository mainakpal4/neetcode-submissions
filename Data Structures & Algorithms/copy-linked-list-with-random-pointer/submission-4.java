/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> oldtonew=new HashMap<>();
        oldtonew.put(null,null);

        Node cur=head;
        while(cur !=null){
            Node copy=new Node(cur.val);
            oldtonew.put(cur,copy);
            cur=cur.next;
        }

        cur=head;
        while(cur!=null){
            Node copy = oldtonew.get(cur);
            copy.next=oldtonew.get(cur.next);
            copy.random=oldtonew.get(cur.random);
            cur=cur.next;
        }

        return oldtonew.get(head);
    }
}
