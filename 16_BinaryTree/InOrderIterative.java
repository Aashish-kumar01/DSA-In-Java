import java.util.Stack;
import java.util.ArrayList;

class NodeBt3{
    int val;
    NodeBt3 left;
    NodeBt3 right;

    NodeBt3(int val){
        this.val = val;
    }
}

public class InOrderIterative {
    public static void main(String[] args) {
        //       1
        //      / \
        //     2   3
        //    / \ / \
        //   4  56   7
        NodeBt3 a = new NodeBt3(1);
        NodeBt3 b = new NodeBt3(2);
        NodeBt3 c = new NodeBt3(3);
        NodeBt3 d = new NodeBt3(4);
        NodeBt3 e = new NodeBt3(5);
        NodeBt3 f = new NodeBt3(6);
        NodeBt3 g = new NodeBt3(7);
        a.left = b; b.left = d;
        c.left = f; b.right = e;
        a.right = c; c.right = g;
        ArrayList<Integer> ans = new ArrayList<>();

        Stack<NodeBt3> st = new Stack<>();
        NodeBt3 curr = a;
        while(st.size() > 0 || curr != null){
            if(curr != null){
                if(curr.left != null){
                    st.push(curr);
                    curr = curr.left;
                }
                else{
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            else{ // curr == null
                NodeBt3 top = st.pop();
                ans.add(top.val);
                curr = top.right;
            }
        }

        for(int x : ans){
            System.out.println(x);
        }
    }
}
