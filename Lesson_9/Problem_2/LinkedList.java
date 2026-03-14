package Lesson_9.Problem_2;
import stack.ArrayStack;
public class LinkedList {
    private Node top;
    private int size;
    public void push(Integer x){
        if(x==null)return;
        Node nn = new Node(x);
        nn.next = top;
        top = nn;
        size++;
    }
    public Integer peek() {
        if(top==null)return null;
        return top.data;
    }
    public Integer pop() {
        Integer ret = peek();
        if(ret != null) {
            top=top.next;
        }
        return ret;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public int size(){ // returns number of items in the stack
        return size;
    }
    @Override
    public String toString() {
       if(isEmpty()) return "<empty>";
        StringBuilder sb = new StringBuilder();
        Node temp=top;
        while(temp!=null) {
                 sb.append(temp.data).append(" ");
            temp=temp.next;
     }
        return sb.toString();
    }
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println("Size = "+"{"+st.size()+"}");
        System.out.println(st.isEmpty());
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
