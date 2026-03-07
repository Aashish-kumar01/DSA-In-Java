class Quad{
    int max;
    int min; 
    int sum;
    int size;
    Quad(int max, int min, int sum, int size){
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.size = size;
    }
    void display(){
        System.out.println(max+" "+min+" "+size+" "+sum);
    }
}
class Node3{
    int val;
    Node3 left;
    Node3 right;

    Node3(int val){
        this.val = val;
    }
}
public class maxMinSum {
    public static void main(String[] args) {
        Node3 root = new Node3(9);
        Node3 left = new Node3(3);
        Node3 right = new Node3(10);
        root.left = left;
        root.right = right;
        Quad ans = helper(root);
        ans.display();
    }    
    public static Quad helper(Node3 root){
        if(root == null) return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
        Quad lst = helper(root.left);
        Quad rst = helper(root.right);
        int max = Math.max(root.val, Math.max(lst.max, rst.max));
        int min = Math.min(root.val, Math.min(lst.min, rst.min));
        int sum = root.val + lst.sum + rst.sum;
        int size = 1 + lst.size + rst.size;
        return new Quad(max, min, sum, size);
    }
}
