package fastds;
import java.util.*;
public class MinStack {
   Stack<Integer> minStack,stack;
   public MinStack(){
    minStack=new Stack<>();
    stack=new Stack<>();
   }
   public void push(int x){
      if(minStack.isEmpty() && stack.isEmpty()){
          minStack.push(x);
          stack.push(x);
      }else{
          if(x < minStack.peek()){
              minStack.push(x);
          }
          stack.push(x);
      }
   }
   public int pop(){
       if(minStack.peek().equals(stack.peek())){
           minStack.pop();
       }
       return stack.pop();
   }
   public int getMin(){
       return minStack.peek();
   }
   public void display(){
       stack.stream().forEach((x) -> {
           System.out.println(" "+x);
       });
   }
    public static void main(String[] args) {
        MinStack m=new MinStack();
        m.push(10);
        m.push(20);
        m.push(30);
        m.push(40);
        m.push(50);
        System.out.println("MIN:  "+m.getMin());
        m.push(3);
        m.push(1);
        m.push(9);
        System.out.println("MIN: "+m.getMin());
        m.pop();
    }
           
}
