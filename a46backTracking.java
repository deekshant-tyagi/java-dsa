public class a46backTracking {
    // print array
     static void printArr(int arr[]){
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
    
     // print 1to5 and decrease by -2 at the time of backTracking
    static void changeArr(int arr[], int i, int val){
        // base case
        if (i ==  arr.length) {
            printArr(arr);
            return;
        }
        // kaam
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        // arr[i] = val-2;
        arr[i] = arr[i]-2;
    }

    //find subsets
    static void findSubSets(String str, int i, String ans){
        //base case
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // Work
        // for yes choice
        findSubSets(str, i+1, ans+str.charAt(i));
        // for no choice
        findSubSets(str, i+1, ans);
    }

    // find permutations
    static void findPermutation(String str,String ans){
        // base case
        if (str.length()==0) {
            System.out.println(ans);
            return;
        }
        // work
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        // changeArr(arr, 0, 1);
        // printArr(arr);
        // findSubSets("abc", 0, "");
        findPermutation("abc", "");
    }
}
