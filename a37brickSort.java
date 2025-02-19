// Class to demonstrate Brick Sort / Odd-Even Sort / Parity Sort
public class a37brickSort {
    // Method to perform brick sort on the given array
    static void brickSort(int arr[]){
        boolean isSorted = false; // Initialize the sorted status as false
        int n = arr.length; // Get the length of the array
        while (!isSorted) {
            boolean flag = false; // Flag to check if any swap is made
            
            // Traverse the array for even indexed elements
            for (int i = 0; i < n-1; i+=2) {
                if (arr[i] > arr[i+1]) { // If current element is greater than the next
                    swap(arr, i, i+1); // Swap the elements
                    flag = true; // Set flag to true indicating a swap was made
                }
            }

            // Traverse the array for odd indexed elements
            for (int i = 1; i < n-1; i+=2) {
                if (arr[i] > arr[i+1]) { // If current element is greater than the next
                    swap(arr, i, i+1); // Swap the elements
                    flag = true; // Set flag to true indicating a swap was made
                }
            }

            // If no swaps were made in the two traversals, the array is sorted
            if (!flag) {
                isSorted = true;
            }
        }
    }

    // Helper method to swap two elements in the array
    static void swap(int arr[], int idx1, int idx2){
        int temp = arr[idx1]; // Store the value of the first element
        arr[idx1] = arr[idx2]; // Assign the value of the second element to the first element
        arr[idx2] = temp; // Assign the stored value to the second element
    }

    // Method to print the elements of the array
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) { // Iterate through the array
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
    }

    // Main method to run the Brick Sort algorithm
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9, 3, 7, 6, 4 }; // Initialize an array with unsorted elements
        brickSort(arr); // Call the brickSort method to sort the array
        printArray(arr); // Print the sorted array
    }
}
