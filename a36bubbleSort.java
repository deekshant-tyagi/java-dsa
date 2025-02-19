// Class to demonstrate Bubble Sort
public class a36bubbleSort {
    // Method to perform bubble sort on the given array
    static void bubbleSort(int arr[]) {
        int n = arr.length - 1; // Get the last index of the array
        for (int i = 0; i < n; i++) {
            boolean flag = false; // Initialize a flag to check if any swap is made
            
            // Traverse the array from the start to the last unsorted element
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) { // If current element is greater than the next
                    swap(arr, j, j + 1); // Swap the elements
                    flag = true; // Set flag to true indicating a swap was made
                }
            }
            
            // If no swaps were made, the array is sorted
            if (!flag) {
                break; // Break out of the loop as the array is already sorted
            }
        }
    }

    // Helper method to swap two elements in the array
    static void swap(int arr[], int ele1, int ele2) {
        int temp = arr[ele1]; // Store the value of the first element
        arr[ele1] = arr[ele2]; // Assign the value of the second element to the first element
        arr[ele2] = temp; // Assign the stored value to the second element
    }

    // Method to print the elements of the array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // Iterate through the array
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
    }

    // Main method to run the Bubble Sort algorithm
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 5, 7, 11}; // Initialize an array with unsorted elements
        bubbleSort(arr); // Call the bubbleSort method to sort the array
        printArray(arr); // Print the sorted array
    }
}
