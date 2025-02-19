// Class to demonstrate Pigeonhole Sort
public class a40pigeonholeSort {

    // Method to perform pigeonhole sort on the given array
    static void pigeonHoleSort(int arr[]) {
        int maxEl = Integer.MIN_VALUE; // Initialize max element to minimum possible value
        int minEl = Integer.MAX_VALUE; // Initialize min element to maximum possible value

        // Finding the maximum and minimum elements in the array
        for (int i = 0; i < arr.length; i++) {
            maxEl = Math.max(maxEl, arr[i]); // Update max element if current element is greater
            minEl = Math.min(minEl, arr[i]); // Update min element if current element is smaller
        }

        // Check for an empty array
        if (maxEl == Integer.MIN_VALUE || minEl == Integer.MAX_VALUE) {
            System.out.println("Empty array");
            return;
        }

        int size = maxEl - minEl + 1; // Calculate the range of the elements

        // Create a pigeonhole array to store the frequency of elements
        int pigeonHole[] = new int[size];

        // Counting the frequency of each element in the original array
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - minEl; // Calculate the index in the pigeonhole array
            pigeonHole[index]++; // Increment the count for the element
        }

        int insertionIndex = 0; // Initialize the insertion index for the sorted array
        
        // Fill the original array with sorted elements
        for (int j = 0; j < size; j++) {
            while (pigeonHole[j] > 0) { // While there are elements in the pigeonhole
                arr[insertionIndex] = j + minEl; // Place the element in the original array
                insertionIndex++; // Move to the next position
                pigeonHole[j]--; // Decrement the count for the element
            }
        }
    }

    // Method to print the elements of the array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // Iterate through the array
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
    }

    // Main method to run the Pigeonhole Sort algorithm
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 1, 2, 66}; // Initialize an array with unsorted elements
        pigeonHoleSort(arr); // Call the pigeonHoleSort method to sort the array
        printArray(arr); // Print the sorted array
    }
}
