// counting sort
public class a38countingSort {

    // Method to perform counting sort on the given array
    static void countingSort(int arr[]){
        // Finding the maximum element in the array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }
        
        // Check for an empty array
        if (max == Integer.MIN_VALUE) {
            System.out.println("Empty Array");
            return;
        }
        
        // Create a count array to store the frequency of each element
        int countArr[] = new int[max + 1];
        
        // Counting the frequency of each element in the original array
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]] += 1; // Increment the count for the element
        }
        
        // Finding the cumulative frequency for the count array
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1]; // Update countArr with cumulative counts
        }
        
        // Create an output array to store the sorted result
        int output[] = new int[arr.length];
        
        // Placing elements in the correct position in the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i]; // Get the value from the original array
            // int index = countArr[val]-1;
            int index = --countArr[val]; // Get the index from the count array and decrement it
            output[index] = val; // Place the value in the output array
            // countArr[val]--;
        }
        
        // Print the sorted array
        printArray(output);
    }

    // Helper method to print the elements of the array
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) { // Iterate through the array
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
    }

    // Main method to run the Counting Sort algorithm
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1}; // Initialize an array with unsorted elements
        countingSort(arr); // Call the countingSort method to sort the array
    }
}

// <-------------------------OR--------------------------->

// public class countSortExample {

//     // Method to perform count sort on the given array
//     static void countSort(int[] arr) {
//         // Find the maximum element in the array
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max)
//                 max = arr[i]; // Update max if current element is greater
//         }

//         // Create a count array to store the frequency of each element
//         int[] counter = new int[max + 1];
        
//         // Count the frequency of each element in the original array
//         for (int i = 0; i < arr.length; i++) {
//             counter[arr[i]]++; // Increment the count for the element
//         }

//         // Place elements in the correct position in the original array
//         int i = 0, step = 0;
//         while (i < counter.length) {
//             if (counter[i] > 0) {
//                 arr[step] = i; // Place the element in the original array
//                 step++; // Move to the next position
//                 counter[i]--; // Decrement the count for the element
//             } else {
//                 i++; // Move to the next element in the count array
//             }
//         }
//     }

//     // Main method to test the Count Sort algorithm
//     public static void main(String[] args) {
//         int[] arr = {4, 2, 2, 8, 3, 3, 1}; // Initialize an array with unsorted elements
//         countSort(arr); // Call the countSort method to sort the array
        
//         // Print the sorted array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " "); // Print each element followed by a space
//         }
//     }
// }
