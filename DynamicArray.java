package fastds;
import java.util.Arrays;
public class DynamicArray<T> implements MyUtils{
    private Object dArray[];
    int SIZE;
    int INDEX;
    public DynamicArray(){
        dArray=new Object[10];
        this.SIZE=10;
        INDEX=-1;
    }
    public DynamicArray(int capacity){
        if(capacity < 0)
            throw new RuntimeException("Size cannot be negative");
        dArray=new Object[capacity];
        this.SIZE=capacity;
        INDEX=-1;
    }
    public void add(T e){
        if(INDEX==SIZE-1){
            Object newArray[];
            newArray = new Object[SIZE+10];
            for(int i=0;i<=INDEX;i++)
                newArray[i]=dArray[i];
            dArray=newArray;
            SIZE+=10;
        }else
            dArray[++INDEX]=e;
    }
    public T get(int index){
        if(index < 0 || index > dArray.length)
           throw new RuntimeException("Index is not valid");
        return (T)dArray[index];
    }
    @Override
    public void sort(){
        //quick sort 
        Arrays.sort(dArray);
    }
    public int size(){
        return SIZE;
    }
    @Override
    public void reverse(){
        
    }
    public void remove(int index){
        if(index < 0 && index > dArray.length )
            throw new RuntimeException("Remove Index Invalid");
        for(int i=index;i<dArray.length-1;i++)
            dArray[i]=dArray[i+1];
        SIZE--;
    }
    public T[] toArray(){
        return (T[])dArray;
    }
    @Override
    public void print(){
        for(int i=0;i<dArray.length && dArray[i]!=null;i++)
            System.out.println(dArray[i]+" ");
    }
}