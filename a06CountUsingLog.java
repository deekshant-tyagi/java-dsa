//1- simple method
// public class a6CountUsingLog {
//     static void countDigits(int num){
//         if (num==0) {
//             System.out.println("Total Digits are : 1");
//             return;
//         }
//         int counter = 0;
//         while (num>0) {
//             num/=10;
//             counter++;
//         }
//         System.out.println("Total Digits are: "+counter);
//     }
//     public static void main(String[] args) {
//         countDigits(1230); // if digits start with zero then it convert it into octal base 8.
//     }
// }


// 2- using log.
public class a6CountUsingLog {
    static void countDigitsLog(int num){
        if (num==0) {
            System.out.println("Total Digits : 1");
            return;
        }
        int count = (int)(Math.log(num)/Math.log(10)+1); // to convert from loge to logbase10 we divide it with log10.
        // int count = (int)Math.log10(num) + 1; direct method.
        System.out.println("Total Digits are : "+count);
    }
    public static void main(String[] args) {
        countDigitsLog(10);
    }
}
