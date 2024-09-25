public class a25BinarySearch2 {
    public static void main(String[] args) {

        // find min element in bitonic array.
        int arr[] = {2,4,6,8,11,16,13,11,9,3,2,1};
        findMinElementInBitonicArray(arr);

        //find peak element in bitonic array.
        int arr1[] = {22,12,5,2,1,0};
        findPeakElementInBitonicArray(arr1);

        // Search Element in Bitonic Array.
        findElementInBitonicArray(arr,13);
    }

    // <------------------Bitonic Array----------------------------->
    // A bitonic array is a sequence of numbers that initially increases and then decreases. It contains a peak element where all elements before it are in ascending order and all elements after it are in descending order.

    // find min element in bitonic array
    static void findMinElementInBitonicArray(int arr[]){
        if (arr.length==0) {
            System.out.println("Array is Empty.");
        } else if (arr.length==1) {
            System.out.println("Min element is: "+arr[0]);
        } else{
            int res = (arr[0]<arr[arr.length-1])?arr[0]:arr[arr.length-1];
            System.out.println("Min Element is: "+res);
        }
    }

    //find peak element in bitonic array.
    static int findPeakElementInBitonicArray(int arr[]){
        int start = 0;
        int end = arr.length-1;
        // int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            int prev = (mid-1 + arr.length)%arr.length;
            int next = (mid+1)%arr.length;
            if(arr[mid] > arr[prev] && arr[mid] > arr[next]){
                // ans = mid;
                // break;
                return mid;
            }else if(arr[mid] > arr[prev]){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        // if(ans == -1) {
        //     System.out.println("Element does not exist");
        //   } else {
        //     System.out.println("Found "+arr[ans]+" at: "+ ans);
        // }
        return -1;
    }

    // Search Element in Bitonic Array.
    static void findElementInBitonicArray(int arr[], int target){
        int peak = findPeakElementInBitonicArray(arr);
        if(peak == -1 || target > arr[peak]) {
            System.out.println("Element does not exist");
        } else {
                if(target == arr[peak]){
                    System.out.println("Found "+arr[peak]+" at: "+ peak);
                    return;
                }
            // search in left half
                int ans = binarySearch(arr,0,peak-1,target);
                if(ans == -1){
                    // search in right half
                    ans = binarySearchDesc(arr,peak+1,arr.length-1,target);
                }
                if(ans == -1){
                    System.out.println("Element does not exist");
                } else {
                    System.out.println("Found "+arr[ans]+" at: "+ ans);
                }
        }
    }

    static int binarySearch(int arr[],int start, int end, int target){
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if(arr[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
      return ans;
    }
    static int binarySearchDesc(int arr[],int start,int end, int target){
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                break;
            } else if(arr[mid]<target){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return ans;


    }

}