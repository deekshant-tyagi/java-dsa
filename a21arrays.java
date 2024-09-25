import java.util.Scanner;
public class a21arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter Element: ");
            int num = sc.nextInt();
            arr[i] = num;
        }
       
        printArray(arr);
        // insert(arr, 2, 44);
        // delete(arr, 2);
        // update(arr, 4, 44);
        // findMax(arr);
        // findMin(arr);
    }

    static void printArray(int arr[]){
        System.out.print("Array Elements are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void insert(int arr1[], int pos, int element){

        int size = arr1.length;

        // Create a new array with increased size
        int[] newArray = new int[size + 1];

        // Copy elements from arr1 to newArray up to size(exclusive ending position)
        System.arraycopy(arr1, 0, newArray, 0, size);

        int newArrSize = newArray.length;
        for(int i=newArrSize-2; i>=pos; i--){
            newArray[i+1] = newArray[i];
        }
        newArray[pos] = element;
        printArray(newArray);
    }

    static void delete(int arr[], int pos){
        for(int i=pos; i<=arr.length-2; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;//explicitly
        printArray(arr);
    }
    
    public static void update(int arr[], int pos, int element){
        int size = arr.length;
        if(pos<0 || pos>size-1){
            System.out.println("Wrong position");
            return;
        }
        arr[pos] = element;
        printArray(arr);
    }

    // Validity Code
    // if(pos<0 || pos>size-1){
    //     System.out.println("Wrong position");
    //     return;
    // }

    public static void findMax(int arr[]){
        //  int max = arr[0];
            int max = Integer.MIN_VALUE; 
            for(int i=0;i<arr.length;i++){
                if(arr[i] > max){
                max = arr[i];
            }
            }
            System.out.println("Maximum element is :" + max);
    }

    public static void findMin(int arr[]){
        //  int min = arr[0];
            int min = Integer.MAX_VALUE; 
            for(int i=0;i<arr.length;i++){
                if(arr[i] < min){
                min = arr[i];
            }
        }
            System.out.println("Minimum element is :" + min);
    }

}