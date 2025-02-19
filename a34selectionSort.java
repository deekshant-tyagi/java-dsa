// public class selectionSort {

//     static void selectionSort(int arr[]){
//         for(int i=0; i<arr.length-1; i++){
//             int minEle = arr[i];
//             int minIdx = i;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[j]<minEle){
//                     minEle = arr[j];
//                     minIdx = j;
//                 }
//             }
//             swap(arr,i,minIdx);
//         }
//     }
//     static void swap(int arr[],int ele1,int ele2){
//         int temp = arr[ele1];
//         arr[ele1] = arr[ele2];
//         arr[ele2] = temp;
//     }
//     static void printArray(int arr[]){
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = {64, 34, 25, 12, 22, 11, 90};
//         selectionSort(arr);
//         printArray(arr);
//     }
// }

// BiDirectionla Selection sort
public class a34selectionSort {

    // Method to perform bidirectional selection sort on the given array
    static void biDirSelectionSort(int arr[]) {
        int k = arr.length - 1; // Get the last index of the array
        for (int i = 0; i < k; i++) {
            int minEle = arr[i]; // Initialize minimum element
            int maxEle = arr[i]; // Initialize maximum element
            int minIdx = i; // Initialize index of the minimum element
            int maxIdx = i; // Initialize index of the maximum element

            // Traverse the array to find minimum and maximum elements
            for (int j = i + 1; j <= k; j++) {
                if (arr[j] < minEle) { // If current element is less than the minimum element
                    minEle = arr[j]; // Update the minimum element
                    minIdx = j; // Update the index of the minimum element
                } else if (arr[j] > maxEle) { // If current element is greater than the maximum element
                    maxEle = arr[j]; // Update the maximum element
                    maxIdx = j; // Update the index of the maximum element
                }
            }
            
            // Swap minimum element with the element at the current position
            swap(arr, i, minIdx); 
            
            // If the maximum element was swapped with the minimum element, update the index{generally for edge cases}
            if (maxEle == arr[minIdx]) {
                swap(arr, k, minIdx); // Swap maximum element to its correct position
            } else {
                swap(arr, maxIdx, k); // Swap maximum element to its correct position
            }
            
            k--; // Decrease the range for the next iteration
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

    // Main method to run the Bidirectional Selection Sort algorithm
    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 5, 0, 1, 12}; // Initialize an array with unsorted elements
        biDirSelectionSort(arr); // Call the biDirSelectionSort method to sort the array
        printArray(arr); // Print the sorted array
    }
}
