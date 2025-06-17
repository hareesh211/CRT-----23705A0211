import java.util.*;

public class GraphAdjList {
    private int vertices;                
    private LinkedList<Integer>[] adj;  
    public GraphAdjList(int v) {
        vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    public void addEdge(int src, int dest) {
        adj[src].add(dest);
    }
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (Integer node : adj[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        GraphAdjList graph = new GraphAdjList(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.printGraph();
    }
}
