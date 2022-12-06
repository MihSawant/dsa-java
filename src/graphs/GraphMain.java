package graphs;

public class GraphMain {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("B", "E");
        graph.addEdge("C", "B");
        graph.addEdge("D", "C");
        graph.addEdge("D", "G");
        graph.addEdge("G", "C");
        graph.addEdge("G", "I");
        graph.addEdge("E", "C");
        graph.addEdge("E", "F");
        graph.addEdge("F", "C");
        graph.addEdge("F","H");
        graph.addEdge("I", "F");
        graph.addEdge("I", "H");
        graph.addEdge("G", "H");
        graph.addEdge("H", "I");
        graph.addEdge("H", "E");

        graph.printAdjacencyList();
    }

}
