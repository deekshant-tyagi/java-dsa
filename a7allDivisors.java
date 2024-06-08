// public class a7allDivisors {
//     static void allDivisors(int num){
//         for(int i=1; i<=num; i++){
//             if (num%i==0) {
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         allDivisors(24);
//     }
// }

// Optimized Soln
public class a7allDivisors {
    static void allDivisorsOpt(int num){
        int counter = 1;
        int sqRoot = (int)Math.sqrt(num);
        while (counter<=sqRoot) {
            if(num%counter==0){
                System.out.println(counter+" is a divisor of "+num);
                int otherNo = num/counter;
                if (otherNo!=counter) {
                    System.out.println(otherNo+" is aa divisor of "+num);
                }
            }
            counter++;
        }
    }
    public static void main(String[] args) {
        allDivisorsOpt(36);
    }
}