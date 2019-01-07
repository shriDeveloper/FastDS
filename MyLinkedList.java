package fastds;

import java.util.Collections;
import java.util.LinkedList;

class Node{
        int data;
        Node next;
        public Node(int d){
            this.data=d;
            this.next=null;
        }
 }
public class MyLinkedList implements MyUtils {
    public Node head;
    public int COUNT=0;
    MyLinkedList(){
        head=null;
    }
    @Override
    public void reverse(){
        Node trav=head,prev=null,nextNode;
        while(trav!=null){
            nextNode=trav.next;
            trav.next=prev;
            prev=trav;
            trav=nextNode;
        }
        head=prev;
    }
    public void addLast(int e){
        ++COUNT;
        Node node=new Node(e);
        if(head==null)
            head=node;
        else{
            Node trav=head;
            while(trav.next!=null)
                trav=trav.next;
            trav.next=node;
        }
    }
    public void addFirst(int e){
        ++COUNT;
        Node node=new Node(e);
        node.next=head;
        head=node;
    }
    public int get(int d){
        Node trav=head;
        int index=0;
        while(trav.next!=null){
            if(trav.data==d)
                return index;
            index++;
            trav=trav.next;
        }
        return index;
    }
    @Override
    public void sort(){
       
    }
    @Override
    public void print(){
        Node trav=head;
        while(trav!=null){
            System.out.print(" "+trav.data);
            trav=trav.next;
        }
    }
    
}
class ListAdd{
    public static void listAdd(Node headA,Node headB,int lenA,int lenB){
        LinkedList<Integer> list=new LinkedList<>();
        Node travA,travB;
        travA=headA;travB=headB;
        int SUM=0,CARRY=0,REM;
        while(travA!=null && travB!=null){
            SUM=(travA.data + travB.data)+CARRY;
            if(SUM > 9){
                REM=SUM%10;
                CARRY=SUM/10;
                list.add(REM);
            }else{
                list.add(SUM);
                CARRY=0;
            }
            travA=travA.next;
            travB=travB.next;
        }
        if(lenA==lenB){
            if(CARRY > 0){
                list.add(CARRY);
            }
        }
        while(travA!=null){
            SUM=(travA.data)+CARRY;
            if(SUM > 9){
                REM=SUM%10;
                CARRY=SUM/10;
                list.add(REM);
            }else{
                list.add(SUM);
                CARRY=0;
            }
            travA=travA.next;
        }
        while(travB!=null){
            SUM=(travB.data)+CARRY;
            if(SUM > 9){
                REM=SUM%10;
                CARRY=SUM/10;
                list.add(REM);
            }else{
                list.add(SUM);
                CARRY=0;
            }
            travB=travB.next;
        }
        Collections.reverse(list);
        for(int x:list)
            System.out.print(" "+x);
        
    }
}
