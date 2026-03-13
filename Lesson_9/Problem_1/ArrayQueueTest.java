package Lesson_9.Problem_1;
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueueImpl aQ = new ArrayQueueImpl(5);
        //initially
        System.out.println("Initially the Queue: "+ aQ);
        //Adding
        aQ.enqueue(10);
        aQ.enqueue(20);
        aQ.enqueue(30);
        aQ.enqueue(40);
        System.out.println("After enqueue: "+ aQ);

        System.out.println("Peek: "+ aQ.peek());
        // Removing
        System.out.println("Removed Element: "+ aQ.dequeue());
        System.out.println("Removed Element: "+ aQ.dequeue());
        System.out.println("After Dequeue: "+ aQ);

        aQ.enqueue(50);
        aQ.enqueue(60);
        System.out.println("After Circular enqueue: "+ aQ);

    }

}
