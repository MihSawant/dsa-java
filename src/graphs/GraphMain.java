package graphs;

public class GraphMain {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

//        graph.addEdge("A", "B");
//        graph.addEdge("A", "C");
//        graph.addEdge("A", "D");
//        graph.addEdge("B", "E");
//        graph.addEdge("C", "B");
//        graph.addEdge("D", "C");
//        graph.addEdge("D", "G");
//        graph.addEdge("G", "C");
//        graph.addEdge("G", "I");
//        graph.addEdge("E", "C");
//        graph.addEdge("E", "F");
//        graph.addEdge("F", "C");
//        graph.addEdge("F","H");
//        graph.addEdge("I", "F");
//        graph.addEdge("I", "H");
//        graph.addEdge("G", "H");
//        graph.addEdge("H", "I");
//        graph.addEdge("H", "E");


//        graph.printAdjacencyList();
//        graph.bfs("A");
//        graph.dfs("A");

        /* trying simple example

            0 ------------ 3
            | \
                 2
            |  /    \
            | /      \
            |/        4
            1
         */

        graph.addEdge("0", "3");
        graph.addEdge("0", "1");
        graph.addEdge("1", "2");
        graph.addEdge("2", "4");
        graph.addEdge("0", "2");

        System.out.println("DFS traversal:");
        graph.dfs("0");
        System.out.println("BFS traversal:");
        graph.bfs("0");

    }

}
