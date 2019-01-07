package fastds;
public class Demo {
    public static void main(String[] args) {
        Graph g=new Graph(10,false);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(1, 7);
        g.addEdge(2, 3);
        g.addEdge(5, 8);       
        
       
        g.print();
        
        
        
        System.out.println("BFS IS: ");
        g.BFS(1);
        System.out.println("");
        
    }
}
