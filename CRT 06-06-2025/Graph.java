public class Practice {
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.printGraph();

        graph.removeEdge(0, 3);
        System.out.println("\nAfter removing edge 0-3:");
        graph.printGraph();

        System.out.println("\nEdge 0-3 exists? " + graph.hasEdge(0, 3));
        System.out.println("Edge 1-2 exists? " + graph.hasEdge(1, 2));
    }
}

class Graph {
    int[][] graph;
    int vertices;

    Graph(int vertices) {
        this.vertices = vertices;
        graph = new int[vertices][vertices];
    }

    void addEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph[src][dest] = 1;
            graph[dest][src] = 1;
        } else {
            System.out.println("Invalid edge: " + src + " - " + dest);
        }
    }

    void removeEdge(int src, int dest) {
        if (isValid(src, dest)) {
            graph[src][dest] = 0;
            graph[dest][src] = 0;
        } else {
            System.out.println("Invalid source or destination");
        }
    }

    boolean hasEdge(int src, int dest) {
        if (isValid(src, dest)) {
            return graph[src][dest] == 1;
        }
        System.out.println("Invalid source or destination");
        return false;
    }

    private boolean isValid(int src, int dest) {
        return src >= 0 && dest >= 0 && src < vertices && dest < vertices;
    }

    void printGraph() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
