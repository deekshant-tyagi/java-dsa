public class a23linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,6,7,2,8};

        linearSearch(arr,4);

        // finding first and last occurence of a no if no repeats multiple times.
        FLlinearSearch(arr, 2, false);
        FLlinearSearch(arr, 2, true);

        //find multiple occurences of a no.
        multiLinearSearch(arr,2);

        // <------------------------2D Array--------------------------------->
        int arr2D[][] = {
            {2,4,1,5,1},
            {6,7,3,4,2},
            {8,1,2,2,3},
            {5,5,7,8,4}
        }; // similar to arr2D[4][5] -> 4 1D arrays and each 1D array size is 5
        linearSearch2D(arr2D, 4);

        // finding first and last occurence of a no if no repeats multiple times.
        FLlinearSearch2D(arr2D, 4, false);
        FLlinearSearch2D(arr2D, 4, true);

        linearSearchMultiple2d(arr2D,4);

        findMaximumSumKiSubarray(arr2D);

    }


    static void linearSearch(int arr[], int target){
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==target) {
                ans = i;
                break; // This breaks out of the nearest loop(for loop)
            }
        }
        if (ans == -1) {
            System.out.println("Element not present.");
        } else{
            System.out.println("Element fount at index: "+ans);
        }
    }
    
    static void FLlinearSearch(int arr[], int target, boolean islast){
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==target) {
                ans = i;
                if (islast == false) {
                    break;
                }
            }
        }
        if (ans == -1) {
            System.out.println("Element not present.");
        } else{
            System.out.println("Element fount at index: "+ans);
        }
    }

    public static void multiLinearSearch(int arr[], int target){
        int ans[] = new int[arr.length]; // bcz in worst case all elements can be same.
        int k = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]==target) {
                ans[k] = i;
                k++;
            }
        }
        if (k==0) {
            System.out.println("Element not present in the array.");
        } else {
            for(int i=0; i<k; i++)
                System.out.println("Element fount at index: "+ans[i]);
        }
    }

    static void linearSearch2D(int arr[][], int target){
        int outerIndex = -1;
        int innerIndex = -1;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if (arr[i][j]==target) {
                    outerIndex = i;
                    innerIndex = j;
                    found = true;
                    break;
                }
            }
            if (found==true) {
                break;
            }
        }
        // or if(outerIndex == -1 && innerIndex == -1) both are same bcz if value of outerindex changes then innnerindex value also changes
        if(outerIndex == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Found element at index: "+ outerIndex + "," + innerIndex);
        }
    }
    
    static void FLlinearSearch2D(int arr[][], int target, boolean islast){
        int outerIndex = -1;
        int innerIndex = -1;
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if (arr[i][j]==target) {
                    outerIndex = i;
                    innerIndex = j;
                    if (islast == false) {
                        found = true;
                        break;
                    }
                }
            }
            if (found==true) {
                break;
            }
        }
        // or if(outerIndex == -1 && innerIndex == -1) both are same bcz if value of outerindex changes then innnerindex value also changes
        if(outerIndex == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Found element at index: "+ outerIndex + "," + innerIndex);
        }
    }

    public static void linearSearchMultiple2d(int arr[][], int target){
        //        int size = arr.length * arr[0].length; only works for 2d array
        int size = 0; // works for 2d as well as jagged array.
        for(int i=0;i<arr.length;i++){
            size = size + arr[i].length;
        }
        int ans[][] = new int[size][2];
        int k=0;
        
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<arr[i].length;j++){
                if(target == arr[i][j]){
                    ans[k][0] = i;
                    ans[k][1] = j;
                    k++;
                }
            }
            if(found == true){
                break;
            }
        }
        
        if(k == 0) {
            System.out.println("Element is not present in the array");
        } else {
            for(int i=0;i<k;i++) {
                System.out.println("Found element at pos: " + ans[i][0] + "," + ans[i][1]);
            }
        }
    }

    static void findMaximumSumKiSubarray(int arr[][]){
        int max = Integer.MIN_VALUE;
        int resIndex = -1;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum = sum + arr[i][j];
            }
            if (sum>max) {
                max = sum;
                resIndex = i;
            }
        }
        System.out.println("Maximum sum subarray is: "+ max +" , for the index: "+ resIndex);
    }


}