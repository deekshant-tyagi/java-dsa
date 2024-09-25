public class a18trailingZerosInFactorial {

    static void trailingZerosFact(int num){
        double res = 0;
        for(int i = 5; i<=num; i=i*5){
            res = res + Math.floor(num/i);
            System.out.println(i);
        }
        System.out.println("Trailing Zeros are : "+res);
    }
    public static void main(String[] args) {
        trailingZerosFact(500); //1 zero
    }
}

// leetcode 172
// class Solution {
//     public int trailingZeroes(int n) {
//         int res = 0;
//         for(int i=5; i<=n; i=i*5){
//             res = res + n/i;
//         }
//         return res;
//     }
// }
