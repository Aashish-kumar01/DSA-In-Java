// import java.util.Stack;

class NodeSt{
    int val;
    NodeSt next;
    NodeSt(int val){
        this.val = val;
    }
}

class MyStack{
    NodeSt head;
    int len;

    int peek() throws Exception{
        if(head == null){
            throw new Exception("Stack underflow error");
        }
        return head.val;
    }

    void push(int ele){
        NodeSt temp = new NodeSt(ele);
        if(len == 0){
            head = temp;
            len++;
            return;
        }
        temp.next = head;
        head = temp;
        len++;
    }

    int pop() throws Exception{
        if(head == null){
            throw new Exception("Stack underflow error");
        }
        int data = head.val;
        head = head.next;
        len--;
        return data;
    }

    int size(){
        return len;
    }

    void display(){
        NodeSt temp = head;
        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LLImplementationOfStack{
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
        st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(50);
        st.push(70);

        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());

    }
}
