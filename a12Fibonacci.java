// fibonacci series
import java.util.*;
public class a12Fibonacci {
    static void fibonacciSeries(int n){
        int firstNo = 0;
        int secondNo = 1;
        for(int i=1; i<=n; i++){
            if (i==1) {
                System.out.println(firstNo);
            }
            else if (i==2) {
                System.out.println(secondNo);
            }
            else{
                int thirdNo = firstNo + secondNo;
                firstNo = secondNo;
                secondNo = thirdNo;
                System.out.println(thirdNo);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of terms : ");
        int n = sc.nextInt();
        fibonacciSeries(n);
    }
}


// to check a no if fibonacci or not 

// import java.util.*;
// public class a12Fibonacci {
//     static void fibNo(int num){
//         int firstNo = 0;
//         int secondNo = 1;
//         if (num == 0 || num == 1) {
//             System.out.println(num+" is a fibonacci no.");
//         }
//         else{
//             for(int i = 1; i<=num; i++){
//                 int thirdNo = firstNo + secondNo;
//                 firstNo = secondNo;
//                 secondNo = thirdNo;
//                 if (num == thirdNo) {
//                     System.out.println(num+" is a fibonacci no.");
                    // break; // or return
//                 }
//             }
//         }
//     }

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter No : ");
//     int num = sc.nextInt();
//     fibNo(num);
//   }  
// }