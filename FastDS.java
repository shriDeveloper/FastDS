package fastds;
class FastDS{
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        MyLinkedList listB=new MyLinkedList();
        
        list.addLast(8);
        list.addLast(2);
        list.addLast(9);
        list.addLast(1);
          
        System.out.println("LIST A; ");
        list.print();
        System.out.println("");
        System.out.println("LIST B;");
        listB.addLast(7);
        listB.addLast(2);
        listB.addLast(4);
        
        listB.print();
        System.out.println("");
        
        System.out.println("FINAL ADDITION IS; ");
  
        ListAdd.listAdd(list.head, listB.head, list.COUNT, listB.COUNT);
        
             
        
    }
}
