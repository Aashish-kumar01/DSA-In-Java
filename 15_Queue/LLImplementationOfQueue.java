class NodeQu{
    int val;
    NodeQu next;
    NodeQu(int val){
        this.val = val;
    }
}

class MyQueue{
    NodeQu head;
    NodeQu tail;
    int size;
    void add(int val){
        NodeQu temp = new NodeQu(val);
        if(size == 0) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    int remove(){
        if(size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }

    int peek(){
        if(size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return head.val;
    }

    void display(){
        NodeQu temp = head;
        if(temp == null){
            System.out.println("Queue is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LLImplementationOfQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();

        System.out.println(q.remove());
        System.out.println(q.peek());
        q.display();
    }
}
