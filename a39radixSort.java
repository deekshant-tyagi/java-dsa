// Class to demonstrate Radix Sort
public class a39radixSort {

    // Method to perform counting sort on the given digit
    static void countingSortOnDigit(int arr[], int digit) {
        int k = 9; // Maximum digit value (0-9)
        int output[] = new int[arr.length]; // Output array to store sorted values
        int countArr[] = new int[k + 1]; // Count array to store frequency of digits

        // Counting the frequency of digits at the specified place value
        for (int i = 0; i < arr.length; i++) {
            int index = (arr[i] / digit) % 10; // Extract the digit at the current place value
            countArr[index]++; // Increment the count for the digit
        }

        // Calculating the cumulative frequency
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1]; // Update countArr with cumulative counts
        }

        // Building the output array based on the cumulative frequency
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i]; // Get the value from the original array
            int countIdx = (val / digit) % 10; // Extract the digit at the current place value
            int countVal = --countArr[countIdx]; // Get the index from the count array and decrement it
            output[countVal] = val; // Place the value in the output array
        }

        // Copying the sorted values back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i]; // Copy each element from output array to original array
        }
    }

    // Method to perform radix sort on the given array
    public static void radixSort(int arr[]) {
        int maxEle = Integer.MIN_VALUE; // Initialize max element to minimum possible value
        
        // Finding the maximum element in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxEle) {
                maxEle = arr[i]; // Update max element if current element is greater
            }
        }

        // Performing counting sort for each digit starting from the least significant digit
        for (int digit = 1; maxEle / digit > 0; digit *= 10) {
            countingSortOnDigit(arr, digit); // Call countingSortOnDigit method for the current digit
        }
    }

    // Method to print the elements of the array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // Iterate through the array
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
    }

    // Main method to run the Radix Sort algorithm
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 1, 2, 66}; // Initialize an array with unsorted elements
        radixSort(arr); // Call the radixSort method to sort the array
        printArray(arr); // Print the sorted array
    }
}
