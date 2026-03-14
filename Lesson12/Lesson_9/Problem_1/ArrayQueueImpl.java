package Lesson_9.Problem_1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;
    // Add Constructors, Default and Parameterized to initialize instance fields
    public ArrayQueueImpl(int capacity){
        this.size=0;
        this.front=0;
        this.rear=0;
        arr= new Integer[capacity];
    }
    public ArrayQueueImpl(){
        this.size=0;
        this.front=0;
        this.rear=0;
        arr=new Integer[DEFAULT_CAPACITY];
    }
    public Integer peek() {
        if(size==0)return null;
        return arr[front];
    }
    public void enqueue(int obj){
      if(size==arr.length){
          resize();
      }
        arr[rear]=obj;
      rear=(rear+1)%arr.length;
      size++;
        System.out.println("front=" + front + " rear=" + rear + " size=" + size);
    }
    public Integer dequeue() {
        if(size==0)return null;
        Integer temp=arr[front];
        arr[front]=null;
        front=(front+1)%arr.length;
        size--;
        System.out.println("front=" + front + " rear=" + rear + " size=" + size);
        return temp;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    private void resize(){
      int newLength=arr.length*2;
      Integer[]newArray=new Integer[newLength];
      for(int i=0;i<size;i++){
          newArray[i]=arr[(front+i)% arr.length];
      }
      arr=newArray;
      front=0;
      rear=size;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder("[");
        for(int i=0;i<size;i++){
            int index=(front+i)%arr.length;
            sb.append(arr[index]);
            if(i+1<size) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }


}
