class NodeLL2{
    int val; // default 0
    NodeLL2 next; // default null

    NodeLL2(int val){
        this.val = val;
    }
}

public class NodeOfLinkedList {
    public static void main(String[] args) {
        // 10->20->30->40->50
        NodeLL2 a = new NodeLL2(10);
        NodeLL2 b = new NodeLL2(20);
        NodeLL2 c = new NodeLL2(30);
        NodeLL2 d = new NodeLL2(40);
        NodeLL2 e = new NodeLL2(50);
        // Connect karenge (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a); 
        System.out.println(b);
        System.out.println(a.next);
    }
}
