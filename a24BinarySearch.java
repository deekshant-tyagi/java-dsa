// OVERVIEW
/*
    1-Binary Search
    2-Binary Search for Decreasing Order.
    3-Binary Search for any order(increasing or decreasing)
    4-Binary Search to find First and Last Occurence
    5-Binary Search to find all Occurences.
    6-Binary Search to find floor of a traget.
    7-Binary Search to find ceil of a traget. 
    8-find floor and ceil using only 1BS.
    9-Find minimum absolute difference using Binary Search
    10-find element in infinite sorted array
    11-finding first one in Binary infinite sorted array.
*/




import java.util.Scanner;
public class a24BinarySearch {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,5,7,11,45,87,90};
        // BinarySearch(arr, 87);

        int arr2[] = {50,43,23,12,4};
        // BinarySearchDec(arr2, 4);
        
        // BinarySearch for any order(inc or dec).
        // binarySearchOrderAgnostic(arr, 11);

        // find first and last occurence.
        int arr3[] = {4, 4, 8, 8, 8, 15, 16, 23, 23, 42};
        // FLbinarySearch(arr3, 4, true);
        // FLbinarySearch(arr3, 4, false);

        // find all the occurences.
        // 1.find first occurence
        // 2. find last occurence
        // 3. put formula UL(upper limit or last occ) - LL(lowerlimit or first occ) + 1

        // System.out.print("Enter Target Element: ");
        // int target = sc.nextInt();
        // int startOcc = AllOccbinarySearch(arr3,target,true);
        // int lastOcc = AllOccbinarySearch(arr3,target,false);
        // if (startOcc == -1) {
        //     System.out.println("Occurence of target is: "+ 0);
        // }
        // else{
        //     System.out.println("Occurence of target is: "+(lastOcc-startOcc+1));
        // }

        // Find floor and ceil value of target using BS.
        // BinarySearchFloor(arr3,20);
        // BinarySearchCeil(arr3,20);

        // Find floor and ceil value of target using only 1BS(my code :)).
        // BinarySearchFC(arr3, 5);

        // find min abs diff using BS.
        int arr4[] = {2,3,4,5,7,9,25,56,61,88,94};
        // AbsDifference(arr4, 58);

        //find element in infinite sorted array
        // assume array is infinite
        // System.out.print("Enter target: ");
        // int tgt = sc.nextInt();
        // findElementInInfiniteSortedArray(arr4, tgt);

        // finding first one in Binary infinite sorted array.
        int arr5[] = {0,0,0,0,0,1,1,1,1,1};
        // findFirstOneInaBinaryInfiniteSortedArray(arr5);
        
    }

    // Binary Search
    public static void BinarySearch(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                ans = mid;
                break;
            }
            else if (arr[mid]<target) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if (ans==-1) {
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Element found at index : "+ans);
        }
    }

    // Binary Search for Decreasing Order.
    public static void BinarySearchDec(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                ans = mid;
                break;
            }
            else if (arr[mid]<target) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if (ans==-1) {
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Element found at index : "+ans);
        }
    }

    //Binary Search for any order(increasing or decreasing)
    static void binarySearchOrderAgnostic(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        if (arr[start]<=arr[end]) {
            BinarySearch(arr, target);
        }
        else{
            BinarySearchDec(arr, target);
        }
    }

    //Binary Search to find First and Last Occurence
    static void FLbinarySearch(int arr[], int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                ans = mid;
                if (isFirst) {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if (arr[mid]<target) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if (ans==-1) {
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Element found at index : "+ans);
        }
    }

    //Binary Search to find all Occurences.
    static int AllOccbinarySearch(int arr[], int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                ans = mid;
                if (isFirst) {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if (arr[mid]<target) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    //Binary Search to find floor of a traget.
    public static void BinarySearchFloor(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                ans = arr[mid];
                break;
            }
            else if (arr[mid]<target) {
                start = mid+1;
                ans = arr[mid];
            }
            else{
                end = mid-1;
            }
        }
        if (ans==-1) {
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Floor of target is : "+ans);
        }
    }

    //Binary Search to find ceil of a traget. 
    public static void BinarySearchCeil(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                ans = arr[mid];
                break;
            }
            else if (arr[mid]<target) {
                start = mid+1;
            }
            else{
                end = mid-1;
                ans = arr[mid];
            }
        }
        if (ans==-1) {
            System.out.println("Element not found.");
        }
        else{
            System.out.println("Ceil of target is : "+ans);
        }
    }

    //Find minimum absolute difference using Binary Search
    public static void AbsDifference(int arr[], int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                ans = 0;
                break;
            }
            else if (arr[mid]<target) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        int floor = end;
        int ceil = start;
        if (ans==-1) {
            if (floor==-1) {
                ans = Math.abs(target - arr[ceil]);
            } else if (ceil==arr.length) {
                ans = Math.abs(target - arr[floor]);
            } else{
                int ans1 = Math.abs(target - arr[floor]);
                int ans2 = Math.abs(target-arr[ceil]);
                ans = (ans1<ans2)?ans1:ans2;
            }
        }
        System.out.println(ans);
    }

    //find floor and ceil using only 1BS.
    public static void BinarySearchFC(int arr[], int target){
        if (arr.length==0) {
            return;
        }
        int start = 0;
        int end = arr.length-1;
        int floor = -1; // edge cases
        int ceil = arr.length;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                System.out.println("Floor: "+arr[mid]+" Ceil: "+arr[mid]);
                return;
            }
            else if (arr[mid]<target) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        ceil = start;
        floor = end;
        if (floor==-1) {
            System.out.println("Floor not found.");
            System.out.println("Ceil : "+arr[ceil]);
        }
        else if (ceil==arr.length) {
            System.out.println("Ceil not found");
            System.out.println("Floor is: "+arr[floor]);
        }
        else{
            System.out.println("Floor : "+arr[floor]+" Ceil: "+arr[ceil]);
        } 
    }
    

    //find element in infinite sorted array
    static void findElementInInfiniteSortedArray(int arr[], int target){
        int range[] = findRangeInInfiniteArray(arr,target);
        int ans = binarySearchInRange(arr,target, range[0],range[1]);
        if(ans == -1){
            System.out.println("Element does not exist");
        } else {
            System.out.println("Found element at index :" + ans);
        }
    }
 
    //finding range in infinite array
    static int[] findRangeInInfiniteArray(int arr[], int target){
        int range[] = new int[2];

        int start = 0;
        int end = 1;

        while(arr[end]<target){
            start = end;
            end = 2*end;
        }
        range[0] = start;
        range[1] = end;

        return range;
    }

    static int binarySearchInRange(int arr[], int target, int start, int end){
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

    // finding first one in Binary infinite sorted array.
    static void findFirstOneInaBinaryInfiniteSortedArray(int arr[]){
        int range[] = findRangeInInfiniteArray(arr,1);
        int ans = binarySearchFirstOccurrenceForFindingFirstOne(arr,1,range[0],range[1]);
        if(ans == -1){
            System.out.println("Element does not exist");
        } else {
            System.out.println("Found element at index :" + ans);
        }
    }

    static int binarySearchFirstOccurrenceForFindingFirstOne(int arr[], int target,int start, int end){
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }

}

