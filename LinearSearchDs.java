public class LinearSearchDs {
    // Iterate collection data elements one by one . 

    // Advantages  :  Good for small and mediam datasets 

    // No need to be sorted . 

    // Use full for that doesn’t have random acess data Structures . 

    // Disadvantages  : Slow in large data sets . 

    public int linearSearch(int arr[], int value) {
        
        for(int i = 0; i < arr.length;  i++) {
            if (arr[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
