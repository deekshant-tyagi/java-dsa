public class a35insertionSort {
    // Method to perform insertion sort on an array
    static void insertionSort(int arr[]){
        // Iterate through each element in the array starting from the second element
        for(int i=1; i<arr.length; i++){
            int key = arr[i]; // The current element to be positioned
            int j = i-1; // Index of the last sorted element
            // Move elements that are greater than 'key' to one position ahead
            while(j>=0 && key<arr[j]){
                arr[j+1] = arr[j]; // Shift element to the right
                j--; // Move to the previous element
            }
            arr[j+1] = key; // Place 'key' in its correct position
        }
    }

    // Method to print the elements of the array
    static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " "); // Print each element followed by a space
        }
    }

    // Main method to execute the sorting and printing
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 7, 11}; // Initial array
        insertionSort(arr); // Sort the array
        printArray(arr); // Print the sorted array
    }
}