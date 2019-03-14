import java.util.*;

class Graph{
    private List<List<Integer>> adjList;
    private int size;
    Graph(int size){
        this.size = size;
        adjList = new ArrayList();
        while(size-- > 0){
            adjList.add(new ArrayList());
        }
    }

    void addEdge(int a, int b){
        adjList.get(a).add(b);
    }

    boolean BFS(int source, int dest){
        Queue<Integer> queue = new LinkedList();
        HashSet<Integer> visited = new HashSet();
        queue.add(source);
        visited.add(source);
        while(!queue.isEmpty()){
            int temp = queue.remove();
            for(int child : adjList.get(temp)){
                if(child == dest){
                    return true;
                }
                if(!visited.contains(child)){
                    queue.add(child);
                }
            }
        }
        return false;
    }

    boolean DFS(int source, int dest){
        HashSet<Integer> visited = new HashSet();
        DFS(source, dest, visited);
        return visited.contains(dest);
    }

    void DFS(int source, int dest, HashSet<Integer> visited){
        visited.add(source);
        if(source == dest){
            return;
        }
        for(int child : adjList.get(source)){
            if(!visited.contains(child)){
                DFS(child, dest, visited);
            }
        }
    }

    List<Integer> showPath() throws Exception{
        HashSet<Integer> start = new HashSet();
        HashSet<Integer> stop = new HashSet();
        List<Integer> list = new LinkedList();
        for(int i=0; i<size; i++){
            if(!stop.contains(i)){
                DFS(i, list, start, stop);
            }
        }
        return list;
    }

    void DFS(int node, List<Integer> list, HashSet<Integer> start, HashSet<Integer> stop) throws Exception{
        start.add(node);
        for(int child : adjList.get(node)){
            if(!start.contains(child)){
                DFS(child, list, start, stop);
            }else{
                if(!stop.contains(child)){
                    throw new Exception("Cycle in the input");
                }
            }
        }
        stop.add(node);
        list.add(node);
    }
}