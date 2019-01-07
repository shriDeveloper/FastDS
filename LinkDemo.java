package fastds;
import java.util.LinkedList;
import java.util.Stack;
public class LinkDemo {
    public static int LENGTH;
    Node head;
    public LinkDemo(){
        head=null;
        LENGTH=0;
    }
    public void add(int x){
        ++LENGTH;
        Node node=new Node(x);
        if(head==null)
           head=node;
        else{
            Node trav=head;
            while(trav.next!=null)
                trav=trav.next;
            trav.next=node;
        }
    }
    public void display(){
        Node trav=head;
        while(trav!=null){
            System.out.print(trav.data+" ");
            trav=trav.next;
        }
    }
    /***
     * GREAT CODE
     * @param k 
     */
    public void reverseListInGroup(int k){
        int I=1;int END=k;
        Stack<Node> stack=new Stack<>();
        LinkedList<Integer> list=new LinkedList<>();
        Node trav=head;
        while(I<=END && END<=LENGTH){
               for(int j=I;j<=END;j++){
                    stack.push(trav);
                    trav=trav.next;
               }
               while(!stack.isEmpty()){
                   list.add(stack.pop().data);
                   if(stack.isEmpty())
                       break;
                   list.add(stack.pop().data);
               }
               list.stream().forEach((x) -> {
                   System.out.print(" "+x);
            });
            stack.clear();
            list.clear();
            I+=k;
            END+=k; 
        }
        while(trav!=null){
            stack.push(trav);
            trav=trav.next;
        }
        while(!stack.isEmpty()){
                   list.add(stack.pop().data);
                   if(stack.isEmpty())
                       break;
                   list.add(stack.pop().data);
               }
               list.stream().forEach((x) -> {
                   System.out.print(" "+x);
            });
    }
    /*
    ITERATIVE LOOP
    public void reverseGroup(int k){
        int i=1,END=k;
        Node trav=head,prev,curr,nextNode;
        while(i<=END && trav.next!=null){
            prev=null;
            curr=trav;
            nextNode=null;
            for(int j=i;j<=END;j++){
             nextNode=curr.next;
             curr.next=prev;
             prev=curr;
             curr=nextNode;
            }
            while(prev!=null){
                System.out.print(" "+prev.data);
                prev=prev.next;
            }
            i+=k;
            END+=k;
            trav=curr;
        }
        System.out.print(" "+trav.data);
    }
    */
    private class Node{
        int data;
        Node next;
        public Node(int x){
            this.data=x;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        LinkDemo ld=new LinkDemo();
        ld.add(10);
        ld.add(20);
        ld.add(30);
        ld.add(40);
        ld.add(50);
        ld.add(60);
        ld.add(70);
        ld.add(80);
        ld.add(90);
        ld.add(100);
        ld.add(110);
        ld.add(120);
        ld.add(130);
        ld.add(140);
        ld.add(150);
        
        
        
       // ld.add(80);
        //ld.add(90);
        
        
      
        ld.reverseListInGroup(2);
       
    }
}
