// to check prime no.

// import java.util.*;
// public class a10PrimeNo {
//     static void primeNo(int num){
//         int count = 0;
//         for(int i=1; i<=num; i++){
//             if (num%i==0) {
//                 count++;
//             }
//         }
//         if (count==2) {
//             System.out.println(num+" is a prime no.");
//         }
//         else{
//             System.out.println(num+" is not a prime no.");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter No : ");
//         int num = sc.nextInt();
//         primeNo(num);
//     }
// }


// Optimezed way to check Prime No

// A number is prime, if it has only 2 factors, 1 and itself. To check if a number is prime, you can iterate from 2 to the square root of the number, and check if the number is divisible by any of these numbers. If it is not divisible by any of these numbers, the number is prime.

// public class a10PrimeNo {
//     public static void primeNoOpt(int num){
//         int sqRoot = (int)Math.sqrt(num);
//         int counter = 2;
//         while (counter<=sqRoot) {
//             if(num%counter==0){
//                 System.out.println(num+" is not a Prime No");
//                 return;
//             }
//             counter++; 
//         }
//         System.out.println(num+" is a Prime No");
//     }
//     public static void main(String[] args) {
//         primeNoOpt(15);
//     }
// }





// prime no from 1 to n.

import java.util.*;
public class a10PrimeNo {
    static void nPrimeNo(int n){
        int i,j;
        for (i = 2; i <= n; i++) {
            for(j = 2; j<i; j++){
                if (i%j==0) {
                    break;
                }
            }
            if (i==j) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Limit : ");
        int n = sc.nextInt();
        nPrimeNo(n);
    }  
}