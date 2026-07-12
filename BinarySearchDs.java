public class BinarySearchDs {
    // O(log n) time complexity class searching algorithm

    // Finding position of a value in a sorted array . 

    // Larger the dataset the binary search is more and more effitiant . 

    
    // Example : 

    // Dividing the array in to two untill the mathcing element finds . 

    // Works only with sorted arrays only . 

    // We are doing random acssesing in the elements . 

    // Always starts searching from the middle of the array . 


    // If there is a array of a 1000 element well remove the 500 elements 
    // because the seatching value is less than the removed 
    // values ,So the number of operations that do in a binary search is 
    // less than linear search in general . 

    int[] arr = new int[10000];

    public void createSortedArrayElements() {
        for(int i = 0; i < arr.length; i++) {
            this.arr[i] = i;
        }
    }

    public int initaiteArrayAndbinarySearch(int target) {
        this.createSortedArrayElements();

        int low = 0;
        int high = arr.length - 1;

        while(arr.length > 0) {
            int middle = low + (high - low) / 2;
            int value = arr[middle];

            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                high = middle - 1;
            } else {
                return middle; // Target found
            }

        }
            
        return -1;
    }
}
