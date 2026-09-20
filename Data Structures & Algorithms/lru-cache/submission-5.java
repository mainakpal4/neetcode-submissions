public class Node{
    int key;
    int val;
    Node prev;
    Node next;


    public Node(int key,int val){
        this.key=key;
        this.val=val;
        this.prev=null;
        this.next=null;
    }
}


class LRUCache {

    private int cap;
    private HashMap<Integer,Node> cache;
    private Node left;
    private Node right;

    public LRUCache(int capacity) {
        this.cap=capacity;
        cache=new HashMap<>();
        this.left=new Node(0,0);
        this.right=new Node(0,0);
        this.left.next=this.right;
        this.right.prev=this.left;

    }

    public void insert(Node n){
        Node prev=this.right.prev;
        this.right.prev=n;
        prev.next=n;
        n.next=this.right;
        n.prev=prev;
    }

    public void remove(Node n){
        Node prev=n.prev;
        Node nxt=n.next;
        prev.next=nxt;
        nxt.prev=prev;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node n=cache.get(key);
            remove(n);
            insert(n); // do not write here this.insert
            return n.val;
        }
        else
        return -1;
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }

        Node n=new Node(key,value);
        cache.put(key,n);
        insert(n);


        if(cache.size()>cap){
            Node lru=this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
