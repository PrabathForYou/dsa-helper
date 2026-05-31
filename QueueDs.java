import java.util.Queue;
import java.util.LinkedList;



public class QueueDs {
    // This is a FIFO(First In First Out) data structurer . 
    // It has to be inharitad from a collection class implemented classes like LinkedList or PriorityQueue
    Queue<String> q = new LinkedList<String>();
    
    public QueueDs() {
    }

    public void addToQueue(String word) {
        // enqueu (means add elements to the queue)
        this.q.offer(word);
    }

    public void removeFromQueue() {
        // dqueue (means remove elements from the queue)
        this.q.poll();
    }

    public void printQueue() {
        System.out.println(this.q);
    }

    public void getSizeOfTheQueue() {
        System.out.println(q.size());
    }

    public boolean checkContains(String word) {
        return q.contains(q.contains(word));
    }
}
