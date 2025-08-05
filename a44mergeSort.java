public class a44mergeSort {
    // Method to print the elements of the array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Method to perform Merge Sort on the given array
    public static void mergeSort(int arr[], int si, int ei) {
        // Base case: If the subarray contains only one element, return immediately
        if (si >= ei) {
            return;
        }
        // Find the middle index of the subarray
        int mid = si + (ei - si) / 2;
        // Recursively call mergeSort on the left and right halves of the subarray
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        // Call merge to merge the two sorted halves
        merge(arr, si, mid, ei);
    }

    // Method to merge two sorted halves of the array
    static void merge(int arr[], int si, int mid, int ei) {
        // Create a temporary array to store the merged elements
        int temp[] = new int[ei - si + 1];
        // Initialize pointers for the left and right halves
        int i = si, j = mid + 1;
        // Initialize a pointer for the temporary array
        int k = 0;
        // Merge the two halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // Copy any leftover elements from the left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Copy any leftover elements from the right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // Copy the merged elements from the temporary array back to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1,-2 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}

