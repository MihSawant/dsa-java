package graphs;

import java.util.*;

public class Graph<T> {

    private Map<T, List<T>> adjacencyList;

    public Graph(){
        this.adjacencyList = new HashMap<>();
    }

    public boolean addEdge(T from, T to){
        if(from == null || to == null){
            return false;
        }
        else{
            // check if from already exists
            List<T> values = adjacencyList.get(from);
            if(values == null){
                // which means it is not in map so add it first
                List<T> list = new ArrayList<>();
                list.add(to);
                adjacencyList.put(from, list);

            } else{
                // we already have it so add its to
                values.add(to);

            }
        }
        return true;
    }




    public void bfs(T source){
        Queue<T> queue = new ArrayDeque<>();
        Set<T> visited = new HashSet<>();
        // add source element to queue and mark it visited
        queue.add(source);
        visited.add(source);


        // loop until queue becomes empty
        while(!queue.isEmpty()){
            // take the first element from queue
            T ele = queue.poll();

            // print it
            System.out.println(ele);

            // get all the neighbours of that node
            List<T> neighbours = adjacencyList.get(ele);

            if(neighbours != null) {
                for (T neighbour : neighbours) {
                    // for each of them check if visited or not
                    if (neighbour != null && !visited.contains(neighbour)) {
                        // if not then mark them visited and add them to queue
                        visited.add(neighbour);
                        queue.add(neighbour);
                    }
                }
            }
        }
    }

    public void printAdjacencyList(){
        adjacencyList.forEach((k, v) -> System.out.println("Node: "+k+"- "+"neighbours: "+v));
    }
}
