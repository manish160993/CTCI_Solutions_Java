import java.util.*;

class ques1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        Graph g = new Graph(scan.nextInt());
        System.out.println("Enter the number of edges");
        int edges_num = scan.nextInt();
        System.out.printf("Enter %d edges",edges_num);
        while(edges_num-->0){
            g.addEdge(scan.nextInt(), scan.nextInt());
        }
        System.out.println(g.BFS(scan.nextInt(), scan.nextInt()));
        System.out.println(g.DFS(scan.nextInt(), scan.nextInt()));

    }
}