import java.util.LinkedList;

public class LinkedListDs {
// Linked lists stores nodes in 2 parts (data + address) . 

// Each node stores data and a reference to the next node.

// Linked list is easy to adjest not like arrays .In arrays inserting and deleting elements is Hard but in linked lists its easy . 

// For every element in the linked list there is a reference(Address) for the next element . 

// This is bad at searching . 

// There are two linked list types "Singly Linked List" and "Doubly Linked List" 



    LinkedList<String> l = new LinkedList<String>();

    public LinkedListDs() {
    }


// Insert 
// When inserting a new node get a address of the node that you wanted to put the new node and itll replace and old node will assignes to its next node and at the end itll create the last node in a new address . 
 
// Delete 
// Just need to get the previos node point(Address) and assigned to its next node .so the next node will removes auto matically . 

// Inserting or deletion will be constant "O(1)" and for searching it will be leanear "O(n)" 
// Doubly Linked List basically one address for the previous node and a onther address for the next node . 
// This uses more memory than single linked list


    public void useAsStackAndAddToTheStack(String word) {
        l.push(word);
    }

    public void useAsStackAndRemoveElement() {
        l.pop();
    }

    public void useAsQueueAndAddElement(String word) {
        l.offer(word);
    }

    public void useAsQueueAndRemoveElement() {
        l.poll();
    }


    // Also lined list has addFirst and addLast method to add element at the beginning and end of the list .
    // Also has removeFirst and removeLast method to remove element at the beginning and end of the list .

    public void addFirst(String word) {
        l.addFirst(word);
    }

    public void addLast(String word) {
        l.addLast(word);
    }

    public void removeFirst() {
        l.removeFirst();
    }

    public void removeLast() {
        l.removeLast();
    }
}
