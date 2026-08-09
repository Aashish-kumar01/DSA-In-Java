import java.util.PriorityQueue;
import java.util.Collections;
class Triplet implements Comparable<Triplet>{
    int dist;
    int x; 
    int y;
    Triplet(int dist, int x, int y){
        this.dist = dist;
        this.x = x;
        this.y = y;
    }
    public int compareTo(Triplet o){
        return this.dist-o.dist;
    }
}
public class KClosestPointsToOrigin {
    public int[][] KClosest(int[][] points, int k){
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] a: points){
            int x = a[0], y = a[1];
            int dist = x*x + y*y;
            pq.add(new Triplet(dist, x, y));
            if(pq.size()>k) pq.remove(); 
        }
        int[][] ans = new int[k][2];
        for(int i=0; i<k; i++){
            Triplet top = pq.remove();
            ans[i][0] = top.x;
            ans[i][1] = top.y;
        }
        return ans;
    }
}
