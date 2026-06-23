import java.util.ArrayList;

public class DynamicArrayDs {
    // ArrayList<String> arr = new ArrayList<String>();
    int size;
    int capacity = 10;
    Object[] array;

    // Dosent have a fixed size , size will be increased 
    // Same like arrays its access time will be O(1) constant time .

    // But this wasted more space(memory) than linked list . 

    // Shifting an element will take more time . 

    // Expanding or Shrinking the array is more time consimungin O(n)
    

    public DynamicArrayDs() {
        this.array = new Object[capacity];
    }

    public DynamicArrayDs(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    
     
}
