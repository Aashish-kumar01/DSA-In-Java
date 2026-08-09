import java.util.Arrays;

class Heap{
    int[] arr;
    int indx = 1;
    int peek(){
        if(size() == 0){
            System.out.println("Heap is Empty");
            return -1;
        }
        return arr[1];
    }
    void add(int ele){
        if(indx == arr.length){
            System.out.println("Heap is full");
            return;
        }
        arr[indx++] = ele;
        // rearrangement
        int root = indx-1;
        while(root!=1){
            int parent = root/2;
            if(arr[root]<arr[parent]){
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            }
            else break;
        }
    }
    int remove(){
        if(indx == 1){
            System.out.println("Heap is empty");
            return -1;
        }
        int min = arr[1];
        arr[indx] = arr[indx-1];
        indx--;
        // rearrangement
        int root = 1;
        while(root<=size()){
            int left = 2*root, right = 2*root+1;
            int leftVal = (left<=size()) ? arr[left] : Integer.MAX_VALUE;
            int rightVal = (right<=size()) ? arr[right] : Integer.MAX_VALUE;
            if(arr[root] < arr[left] && arr[root] > arr[right]) break;
            else{
                if(leftVal<rightVal){ //left child se swap karna hai
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                }
                else{ // right child se swap karna hai
                    int temp = arr[root];
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = right;
                }
            }
        }
        return min;
    }
    void display(){
        for(int i = 1; i<indx; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int size(){
        return indx-1;
    }
    Heap(int capacity){
        arr = new int[capacity+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
    }
}
public class MinHeapImplementation {
    public static void main(String[] args){
        Heap h = new Heap(10);
        h.add(10); h.add(8); h.add(9); h.add(4);
        h.display();
        System.out.println(h.remove());
        h.display();
        h.add(2); h.display();
        System.out.println(h.remove());
        h.display();
    }
}
