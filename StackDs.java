import java.util.Stack;

public class StackDs {
    // This data structurer is Last in First out 
    // Stores objects into a sort of vertical tower . 

    Stack<String> s;

    public StackDs() {
        this.s = new Stack<String>();
    }

    public void printStack() {
        System.out.println(this.s);
    }

    public void addToStack(String word) {
        this.s.add(word);
    }

    public void removeFromStack() {
        this.s.pop();
    }
}