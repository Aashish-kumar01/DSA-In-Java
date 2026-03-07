import java.util.LinkedList;
// import java.util.List;
import java.util.Queue;
// import java.util.ArrayList;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

class Pair{
    Node node;
    int level;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}

public class Implementation {
    public static void main(String[] args) {
        //      3
        //    /   \
        //   4     2
        //  / \   / \ 
        //-1   1 6   9 
        Node a = new Node(3); // root
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        // display(a);
        // preOrder(a);
        // System.out.println();
        // inOrder(a);
        // System.out.println();
        // postOrder(a);
        levelOrder(a);
        levelOrderLineWise(a);
        // System.out.println();
        // System.out.println(size(a));
        // System.out.println(sum(a));
        // System.out.println(product(a));
        // System.out.println(pdctOfNonZeroEle(a));
        // System.out.println(levels(a));
        KthLevel(a, 0, 2);
        System.out.println();

        // for(int i = 0; i<levels(a); i++){
        //     KthLevel(a,0,i);
        //     System.out.println();
        // }
    }

    private static void KthLevel(Node root, int level, int k){
        if(root == null) return;
        if(level == k) System.out.print(root.val+" ");
        KthLevel(root.left,level+1, k);
        KthLevel(root.right,level+1, k);
    }
    private static void levelOrderLineWise(Node root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int currlevel = 0;
        while(q.size() > 0){
            Pair front = q.remove();
            if(front.level > currlevel){
                System.out.println();
                currlevel = front.level;
            }
            System.out.print(front.node.val+" ");
            if(front.node.left != null) q.add(new Pair(front.node.left, currlevel+1));
            if(front.node.right != null) q.add(new Pair(front.node.right, currlevel+1));
        }
        System.out.println();
    }
 
    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            Node front = q.remove();
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
            System.out.print(front.val+" ");
        }
        System.out.println();
    }

    private static void postOrder(Node root) {
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    private static void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    private static int levels(Node root) {
        if(root == null) return 0;
        return 1+ Math.max(levels(root.left), levels(root.right));
    }

    // private static void display(Node root) {
    //     if(root == null) return;
    //     System.out.print(root.val+" ");
    //     display(root.left); // left ki saari values ko print kar do
    //     display(root.right); // right ki saari values ko print kar do
    // }


    private static void preOrder(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left); // left ki saari values ko print kar do
        preOrder(root.right); // right ki saari values ko print kar do
    }


    public static int size(Node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int pdctOfNonZeroEle(Node root){
        if(root == null) return 1;
        int prd = root.val;
        if(prd == 0) prd = 1;
        return prd*pdctOfNonZeroEle(root.left)*pdctOfNonZeroEle(root.right);
    }
    public static int product(Node root){
        if(root == null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
}
