package fastds;
public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root=null;
    }
    private class Node{
        Node left;
        int data;
        Node right;
        public Node(int x){
            left=right=null;
            data=x;
        }
    }
    public void display(){
        print(root);
    }
    public void insert(int x){
        root=insert(x,root);
    }
    public boolean isFound(int x){
        Node trav=root;
        while(trav!=null){
         if(trav.data==x)
             return true;
         else if(x < trav.data)
             trav=trav.left;
         else
             trav=trav.right;
        }
        return false;
    }
    private Node insert(int y,Node root){
        if(root==null) return new Node(y);
        else if(y <=root.data)
            root.left=insert(y,root.left);
        else
            root.right=insert(y,root.right);
        return root;
    }
    private void print(Node root){
        if(root!=null){
            print(root.left);
            System.out.println(" "+root.data);
            print(root.right);
        }
    }
}
