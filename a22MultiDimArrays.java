import java.util.*;
public class a22MultiDimArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] my2DArray = new int[3][2];
        for (int i = 0; i < my2DArray.length; i++) {
            for(int j=0; j<my2DArray[i].length; j++){
                System.out.print("Enter "+j+" element: ");
                int element = sc.nextInt();
                my2DArray[i][j] = element;
            }
            System.out.println();
        }
        print2DArray(my2DArray);
        // insert2DArray(my2DArray,1,1,12);
        // deletion2DArray(my2DArray,2,1);
        // update2dArray(my2DArray, 0, 0, 12);
    }

    // Print 2d Array.
    public static void print2DArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            System.out.print("For "+i+" index: ");
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(); // optional just to make diff in code for insertion and del.
    }

    static void insert2DArray(int arr[][], int pos1, int pos2, int element){
        for(int i = arr[pos1].length-2; i>=pos2; i--){
                arr[pos1][i+1] = arr[pos1][i];
            }
        arr[pos1][pos2] = element;
        print2DArray(arr);
    }


    static void deletion2DArray(int arr[][], int pos1, int pos2){
        for(int i = pos2; i<=arr[pos1].length-2; i++){
            arr[pos1][i] = arr[pos1][i+1];
        }
        arr[pos1][arr[pos1].length-1] = 0;
        print2DArray(arr);
    }

    // By re-using function of 1D array(present in a21arrays.java).
    // public static void insert2dArray(int arr[][], int pos1, int pos2, int element){
    //     insert(arr[pos1], pos2, element);
    // }
    // public static void delete2dArray(int arr[][], int pos1, int pos2){
    //     delete(arr[pos1], pos2);
    // }

    public static void update2dArray(int arr[][], int pos1,int pos2, int element){
        int size1 = arr.length;
        if(pos1<0 || pos1>size1-1){
            System.out.println("Wrong position");
            return;
        }
        int size2 = arr[pos1].length;
        if(pos2<0 || pos2>size2-1){
            System.out.println("Wrong position");
            return;
        }
        arr[pos1][pos2] = element;
        print2DArray(arr);
    }


    // Jagged arrays in java
    // Jagged Arrays: If you specifically meant arrays where each sub-array (row) can have different lengths, these are called jagged arrays. Java supports this through arrays of different lengths within a 2D array structure.
    // int[][] jaggedArray = new int[3][];
    // jaggedArray[0] = new int[] {1, 2, 3};
    // jaggedArray[1] = new int[] {4, 5};
    // jaggedArray[2] = new int[] {6, 7, 8, 9};

}

