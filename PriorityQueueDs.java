import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDs {
// This is FIFO data structure . 
// This puts elements in a somekind of order . 
// This adds a order to the elements in the queue like a ascendic order.
// For example 2,4,3,1 will stores as 1,2,3,4 
// and "A","C","B","D" will stores as "A","B","C","D"

// We can sort the queue eleements to the parameter as well like below
// PriorityQueue<>(Collections.reverse()) Itll be like 4,3,2,1

    Queue<Double> q = new PriorityQueue<>();

    public PriorityQueueDs() {
    }

    public void addToQueue(Double number) {
        q.offer(number);
    }

    public void removeFromQueue() {
        q.poll();
    }

    public void readTheQueue() {
        System.out.println(q);
    }
}
