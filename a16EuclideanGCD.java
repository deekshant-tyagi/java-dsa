// direct method
// public class a16EuclideanGCD { 
//     static void gcd(int num1,int num2){
//         int min = (num1<=num2)?num1:num2;
//         while (min>0) {
//             if (num1%min==0 && num2%min==0) {
//                 System.out.println("GCD is: "+min);
//                 return;
//             }
//             min--;
//         }
//         int max = (num1>=num2)?num1:num2;
//         System.out.println("GCD is: "+max);
//     }
//     public static void main(String[] args) {
//         gcd(24, 36);
//     }
// }

// Euclidean method
/**
 * a16EuclideanGCD
 */
public class a16EuclideanGCD {
    static void euclideanGCD(int num1,int num2){
        while (num1!=0 && num2!=0) {
            if (num1>num2) {
                num1-=num2; // or num1%=num2; // % efficient euclidean
            }
            else{
                num2-=num1;// or num2%=num1;
            }
        }
        int res = num1;
        if (num1==0) {
            res = num2;
        }
        System.out.println("GCD is: "+res);
    }
    public static void main(String[] args) {
        euclideanGCD(36, 24);
    }
}