package fastds;
import java.util.*;
public class Graph {
    private final HashMap<Integer,LinkedList<Integer>> graph;
    private final boolean IS_DIRECTED;
    private final int SIZE;
    public Graph(int N,boolean IS_DIRECTED){
        this.IS_DIRECTED=IS_DIRECTED;
        this.SIZE=N;
        graph=new HashMap<>();
        for(int i=1;i<=N;i++)
            graph.put(i,new LinkedList<>());     
    }
    public void addEdge(int x,int y){
        LinkedList<Integer> list;
        if(IS_DIRECTED){
            list=graph.get(y);
            list.add(x);
            graph.put(y, list);
        }
        list=graph.get(x);
        list.add(y);
        graph.put(x, list);
    }
    public void BFS(int v){
        LinkedList<Integer> Queue=new LinkedList<>();
        boolean visited[]=new boolean[SIZE];
        Queue.add(v);
        visited[v]=true;
        while(Queue.size()!=0){
         int x=Queue.poll();
         System.out.print(x+" ");
         Iterator<Integer> itr=graph.get(x).iterator();
         while(itr.hasNext()){
             int i=itr.next();
             if(!visited[i]){
                 visited[i]=true;
                 Queue.add(i);
             }
         }
        }  
    }
    public void print(){
        for(Map.Entry<Integer,LinkedList<Integer>> mapped:graph.entrySet()){
            System.out.print(" "+mapped.getKey()+"->");
            for(int y:mapped.getValue()){
                System.out.print(" "+y);
            }
            System.out.println();
        }
    }
}
