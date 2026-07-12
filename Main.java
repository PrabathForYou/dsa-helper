public class Main {
    public static void main(String []args) {
        String testWord = "Test";

        // StackDs sds = new StackDs();
        // sds.addToStack(testWord);
        // sds.printStack();

        // QueueDs q = new QueueDs();
        // q.addToQueue(testWord);
        // q.printQueue();
        // q.removeFromQueue();
        // q.getSizeOfTheQueue();
        // System.out.println(q.checkContains(testWord));

        // PriorityQueueDs pq = new PriorityQueueDs();

        // for (double i = 1.0; i < 4.0; i += 0.5) {
        //     pq.addToQueue(i);
        // }
        // pq.readTheQueue();


        // int[] array = {1,5,63,2,8,10};
        // int findValue = 123;
        // LinearSearchDs ls = new LinearSearchDs();
        // System.out.println(ls.linearSearch(array, findValue));

        BinarySearchDs bs = new BinarySearchDs();
        System.out.println("Here is the location " + bs.initaiteArrayAndbinarySearch(1000000));
    }
}