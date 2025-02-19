// Class to demonstrate Cyclic Sort for any variation
public class a41cyclesSort {

    // Method to perform cyclic sort on the given array
    public static void cyclicSort(int arr[]) {
        int n = arr.length; // Get the length of the array

        // Iterate through the array to place each element at its correct position
        for (int cycles = 0; cycles < n - 1; cycles++) {
            int pos = cycles; // Initial position for the current cycle
            int item = arr[cycles]; // Store the current element

            // Finding the correct position for the current element
            for (int i = cycles + 1; i < n; i++) {
                if (arr[i] < item) {
                    pos++; // Increment position for each element smaller than the current element
                }
            }

            // If the element is already at its correct position
            if (pos == cycles) {
                continue;
            }

            // If duplicates are present, skip them
            while (arr[pos] == item) {
                pos++;
            }

            // If the element is not at its correct position, swap it
            if (pos != cycles) {
                int temp = arr[pos]; // Temporary storage for the element at the current position
                arr[pos] = item; // Place the current element at its correct position
                item = temp; // Update the item with the swapped element
            }

            // Check if more swaps are needed to place the element correctly
            while (pos != cycles) {
                pos = cycles; // Reset position for the next cycle

                // Finding the correct position for the current element
                for (int i = cycles + 1; i < n; i++) {
                    if (arr[i] < item) {
                        pos++; // Increment position for each element smaller than the current element
                    }
                }

                // If duplicates are present, skip them
                while (arr[pos] == item) {
                    pos++;
                }

                // If the element is not at its correct position, swap it
                if (item != arr[pos]) {
                    int temp = arr[pos]; // Temporary storage for the element at the current position
                    arr[pos] = item; // Place the current element at its correct position
                    item = temp; // Update the item with the swapped element
                }
            }
        }
    }

    // Method to print the elements of the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // Iterate through the array
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
    }

    // Main method to run the Cyclic Sort algorithm
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5, 6, 7, 8, 10, 9}; // Initialize an array with unsorted elements
        cyclicSort(arr); // Call the cyclicSort method to sort the array
        printArray(arr); // Print the sorted array
    }
}
