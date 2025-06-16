import java.util.*;

public class Graph {
    private Map<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }


    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }


    public void addEdge(String src, String dest) {
        addVertex(src);
        addVertex(dest);
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }


    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            System.out.println(adjList.get(vertex));
        }
    }


    public List<String> getNeighbors(String vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>());
    }


    public boolean hasVertex(String vertex) {
        return adjList.containsKey(vertex);
    }
}
