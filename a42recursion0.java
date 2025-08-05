// Basics Of Recursion
public class a42recursion0 {
    //1-print no in dec order
    public static void printDec(int n) {
        // writing the base case
        if(n==1){
            System.out.println(n);
            return;
        }
        // writing the recursive case
        System.out.println(n);
        printDec(n-1);

    }

    // 2-print no in inc order
    static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    //3-factorial of a no
    static int factorial(int n){
        if (n==0) {
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
        return fn;
    }

    //4-sum of n natural numbers
    static int sumOfnNo(int n){
        if (n==1) {
            return 1;
        }
        int sum = n + sumOfnNo(n-1);
        return sum;
    }

    //5- calc nth term in fibonacci
    static int fibo(int n){
        if (n==0 || n==1) {
            return n;
        }
        int fnm1 = fibo(n-1);
        int fnm2 = fibo(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    //6- Check if array is sorted or not
    static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    //7- find the first occurence of a no
    static int firstOcc(int arr[],int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }

    //8- find the last occ
    static int lastOcc(int arr[],int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if (isFound == -1 && arr[i]==key) {
            return i;
        }
        return isFound;
    }

    //9- calculate x^n
    static int power(int x, int n) {
        if (n==0) {
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;
        
        return x*power(x, n-1); 
    }

    //10- optimized x^n
    static int optimizedPower(int x,int n){
        if (n==0) {
            return 1;
        }
        int halfPow = optimizedPower(x, n/2);
        int halfPowSq = halfPow * halfPow; //O(n)
        // int halfPowSq = optimizedPower(x, n/2) * optimizedPower(x, n/2); O(n)
        if (n%2!=0) {
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }



    public static void main(String[] args) {
        
        int n = 5;
        // printDec(n);
        // printInc(n);
        // System.out.println(factorial(n));
        // System.out.println(sumOfnNo(n));
        // System.out.println(fibo(n));\
        int arr[] = {1,2,3,4,7,5};
        // System.out.println(isSorted(arr, 0));
        int arr1[] = {2,5,6,4,8,9,1,3,4};
        // System.out.println(firstOcc(arr1, 4, 0));
        // System.out.println(lastOcc(arr1, 4, 0));
        // System.out.println(power(2, 5));
        System.out.println(optimizedPower(2, 10));
    }
}
