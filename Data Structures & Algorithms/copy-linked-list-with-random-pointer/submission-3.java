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

        // HashMap<Node,Node > hm=new HashMap<>();
        // Node temp=head;

        // while(temp!=null){
        //     hm.put(temp,new Node(temp.val));
        //     temp=temp.next;
        // }

        // temp=head;
        // while(temp!=null){
        //     Node copy=hm.get(temp);
        //     copy.next=hm.get(temp.next);
        //     copy.random=hm.get(temp.random);
        //     temp=temp.next;
        // }

        // return hm.get(head);
        

        Node temp=head;
  

        //add node in between
        while(temp!=null){
            Node clone=new Node(temp.val);
            clone.next=temp.next;
            temp.next=clone;
            temp=temp.next.next;
        }

        //random pointing nodes
        temp=head;
        while(temp!=null){
            Node clone=temp.next;
            if(temp.random!=null)
            clone.random=temp.random.next;
            temp=temp.next.next;
        }

        //breaking links and connecting next
        Node dummy=new Node(-1);
        Node curr=dummy;
        temp=head;
        while(temp!=null){
            curr.next=temp.next;
            temp.next=temp.next.next;

            curr=curr.next;
            temp=temp.next;
        }

        return dummy.next;



    }
}
