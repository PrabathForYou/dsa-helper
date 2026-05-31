public class Main {
    public static void main(String []args) {
        String testWord = "Test";

        // StackDs sds = new StackDs();
        // sds.addToStack(testWord);
        // sds.printStack();

        QueueDs q = new QueueDs();
        q.addToQueue(testWord);
        q.printQueue();
        q.removeFromQueue();
        q.getSizeOfTheQueue();
        System.out.println(q.checkContains(testWord));
    }
}