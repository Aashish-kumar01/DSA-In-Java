class NodeLL{
    int val;
    NodeLL next;
    NodeLL(int val){
        this.val = val;
    }
}

public class DisplayList {
    public static void display(NodeLL head){
        NodeLL temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

        // By recursion
        // if(head == null) return;
        // System.out.print(head.val+" ");
        // display(head.next);

    }
    public static void main(String[] args) {
        NodeLL a = new NodeLL(10);
        NodeLL b = new NodeLL(20);
        NodeLL c = new NodeLL(30);
        NodeLL d = new NodeLL(40); 
        NodeLL e = new NodeLL(50);
        NodeLL f = new NodeLL(60);

        a.next = b; 
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // display(a);

        System.out.println(get(a,4));
    }

    public static int get(NodeLL head, int indx){
        NodeLL temp = head;
        for(int i = 0; i<indx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}
