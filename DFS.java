import java.util.*;

public class DFS {
    private LinkedList<Integer> adjList[];
    private boolean visited[];

    public DFS(int vertices){
        adjList=new LinkedList[vertices];
        visited= new boolean[vertices];

        for(int i=0;i<vertices;i++)
            adjList[i]= new LinkedList<Integer>();
    }

    private void addEdge(int source, int value){
        adjList[source].add(value);
    }

    private void DFSSearch(int vertex){
        visited[vertex]=true;
        System.out.println(vertex+" ");

        Iterator<Integer> ite= adjList[vertex].listIterator();

        while(ite.hasNext()){
            int adj=ite.next();
            if(!visited[adj])
                DFSSearch(adj);
        }
    }

    public static void main(String[] args){
        DFS g= new DFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 1);

        g.DFSSearch(0);
    }

}
