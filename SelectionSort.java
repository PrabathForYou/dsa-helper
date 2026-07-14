public class SelectionSort {
// O(n^2)
// Imagine it as a set of boxes .well search throgh each boxes and sort . 

// Example : If there is a insorted array wil get the first element of the array and itll place as minimum value .If the next value is less than the first element then well replace it by that . 
    // int[] array = {1,5,63,2,8,10};

    // Not tested yet
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}