import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC1971 {
    public static void main(String[] args) {

    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n; i++){
            List<Integer> list =  new ArrayList<>();
            adj.add(list);
        }
        for(int i = 0; i<edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] visit = new boolean[n];
        visit[source] = true;
        bfs(source,adj,visit);
        return visit[destination];
    }
    public void bfs(int source, List<List<Integer>> adj, boolean[] visit){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(q.size()>0){
            int front = q.remove();
            for(int ele : adj.get(front)){
                if(!visit[ele]){
                    q.add(ele);
                    visit[ele] = true;
                }
            }
        }
    }
}
