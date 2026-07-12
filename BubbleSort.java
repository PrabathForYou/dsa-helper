public class BubbleSort {
    // Very slow searching algorithm O(n^2) complaxity .
    // Switching elements untill there is an order . 

    // Its like water with lots of objects .getting all the heavy elements to the bottom and like bubbles well get to the top . 

    public void sort(int[] array) {
        // First for loop will run  the array length size iterations
            for(int i = 0; i < array.length - 1; i++) {
                // inner loop moves throgh array and compare naibering numbers
                for(int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        // swap the two values
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            for (int number : array) {
                System.out.println(number + " ");
            }
    }
}
