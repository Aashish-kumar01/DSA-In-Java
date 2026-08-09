import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmall {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: arr){
            pq.add(ele);
            if(pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {2, 53, 61, 91, 10, 98, 22};
        int k = 3;
        System.out.println(kthSmallest(arr, k));
    }
}