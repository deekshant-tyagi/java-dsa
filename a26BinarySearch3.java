public class a26BinarySearch3 {
    // Binary search on Sorted Rotated Array , it can be clockWise and anti-Clockwise.
    public static void main(String[] args) {
        int arr[] = {7,11,15,16,2,4,6};

        // 1.finding min(target) in rotated sorted array.
        int minEle = minElement(arr);
        System.out.println("Index of Min element is: "+minEle+" and min element is: "+arr[minEle]);

        // 2.finding min(target) in rotated sorted array 2, where duplicates are allowed.
        int arr1[] = {3,4,5,1,1,2};
        int minEle2 = minElement2(arr1);
        System.out.println("Index of Min element is: "+minEle2+" and min element is: "+arr1[minEle2]);

        // 3 Rotation count in cloclWise sorted arr
        rotationCountInCWsa(arr);
        // 4 Rotation count in antiCloclWise sorted arr
        rotationCountInACWsa(arr);

        // 5 finding max(target) in rotated sorted array.
        int maxEle = maxElement(arr);
        System.out.println("Index of Max element is: "+maxEle+" and Max element is: "+arr[maxEle]);

        // 6 Search in RSA;
        int indexPos = searchInRotatedSA(arr, 11);
        System.out.println("Element fount at Index: "+indexPos);
    }

    // 1.finding min(target) in rotated sorted array.
    public static int minElement(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid> 0 && arr[mid]<arr[mid-1]) {
                return mid;
            } else if (arr[mid]<arr[end]) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return start;
    }

    // 2.finding min(target) in rotated sorted array 2, where duplicates are allowed.
    public static int minElement2(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                start++;
                end--;
            } else if (mid> 0 && arr[mid]<arr[mid-1]) {
                return mid;
            } else if (arr[mid]<=arr[end]) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return start;
    }

    // 3 Rotation count in cloclWise sorted arr
    static void rotationCountInCWsa(int arr[]){
        int index = minElement(arr);
        System.out.println("CW Rotation Count: "+index);
    }

    // 4 Rotation count in antiCloclWise sorted arr
    static void rotationCountInACWsa(int arr[]){
        int index = minElement(arr);
        System.out.println("ACW Rotation Count: "+((arr.length-index)%arr.length));
    }

    // 5 finding max(target) in rotated sorted array.
    static int maxElement(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while (start<end) {
            int mid = start + (end-start) / 2;
            if (mid < arr.length-1 && arr[mid]>arr[mid+1]) {
                return mid;
            } else if (arr[start]>arr[mid]) {
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return end;
    }

    // 6 Search in RSA
    static int searchInRotatedSA(int arr[], int target){
            int start = 0;
            int end = arr.length-1;
            while(start<=end){
                int mid = start + (end-start) / 2;
                if(target==arr[mid]){
                    return mid;
                }
                else if(arr[start]<=arr[mid]){
                    if(arr[start]<=target && target<arr[mid]){
                        end = mid - 1;
                    } else{
                        start = mid+1;
                    }
                }
                else{
                    if(arr[end]>=target && target> arr[mid]){
                        start = mid + 1;
                    } else{
                        end = mid - 1;
                    }
                }
            }
            return -1;
        }
}