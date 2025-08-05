public class a45quickSort {
    // Prints the elements of the array
    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    // Sorts the array using Quick Sort algorithm
    static void quickSort(int arr[],int si, int ei){
        // Base case: If the subarray contains only one element, return immediately
        if (si>=ei) {
            return;
        }
        // Partition the array and find the pivot index
        int pIdx = partition(arr,si,ei);
        // Recursively call quickSort on the left and right subarrays
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    // Partitions the array and finds the pivot index
    static int partition(int arr[],int si, int ei){
        // Choose the last element as the pivot
        int pivot = arr[ei];
        // Initialize the index of the smaller element
        int i = si-1;
        // Iterate through the array and swap elements smaller than the pivot with the element at index i
        for(int j=si; j<ei; j++){
            if (arr[j]<=pivot) {
                i++;
                // Swap elements
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Swap the pivot element with the element at index i+1
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        // Return the pivot index
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5,-2};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}

