package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void printAdjacencyList(){
        adjacencyList.forEach((k, v) -> System.out.println("Node: "+k+"- "+"neighbours: "+v));
    }
}
