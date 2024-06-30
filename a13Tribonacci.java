// Tribonacci series.
import java.util.*;
public class a13Tribonacci {
    static void tribonacciSeries(int n){
        int firstNo = 0;
        int secondNo = 0;
        int thirdNo = 1;
        for(int i=1; i<=n; i++){
            if (i==1) {
                System.out.println(firstNo);
            }
            else if (i==2) {
                System.out.println(secondNo);
            }
            else if (i==3) {
                System.out.println(thirdNo);
            }
            else{
                int fourthNo = firstNo + secondNo + thirdNo;
                firstNo = secondNo;
                secondNo = thirdNo;
                thirdNo = fourthNo;
                System.out.println(fourthNo);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of terms : ");
        int n = sc.nextInt();
        tribonacciSeries(n);
    }
}


// leetcode 1137

// class Solution {
//     public int tribonacci(int n) {
//         if(n==0){
//             return 0;
//         }
//         else if(n==1 || n==2){
//             return 1;
//         }
//         else{
//             int firstNo = 0;
//             int secondNo = 1;
//             int thirdNo = 1;
//             for(int i=1; i<=n; i++){
//                 int fourthNo = firstNo + secondNo + thirdNo;
//                 firstNo = secondNo;
//                 secondNo = thirdNo;
//                 thirdNo = fourthNo;
//             }
//             return firstNo;
//         }
        
//     }
// }



/**
 * a13Tribonacci
 * To check a given no is a tribonacci no or not.
 */
// import java.util.*;
// public class a13Tribonacci {

//     static void triboNo(int num){
//         if (num == 0 || num == 1) {
//             System.out.println(num+" is a Tribonacci No.");
//             return;
//         }
//         else{
//             int firstNo = 0;
//             int secondNo = 0;
//             int thirdNo = 1;
//             for(int i=1; i<=num; i++){
//                 int fourthNo = firstNo + secondNo + thirdNo;
//                 firstNo = secondNo;
//                 secondNo = thirdNo;
//                 thirdNo = fourthNo;
//                 if (num==fourthNo) {
//                 System.out.println(num+" is a Tribonacci No.");
//                 return;
//                 }
//             }
//         }
//         System.out.println(num+" is not a Tribonacci No.");
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter No to Check: ");
//         int num = sc.nextInt();
//         triboNo(num);
//     }
// }