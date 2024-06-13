// factorial = N x N-1......TILL 1
import java.util.*;
public class a11factorial {

    // static void factorial(int num){
    //     int fact=1;
    //     for(int i=1; i<=num; i++){
    //         fact = fact*i;
    //     }
    //     System.out.println("Factorial of "+num+" is "+fact);
    // }

    public static void factorial(int num){
        double res = 1;
        while (num>1) {
            res = res*num;
            num--;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int num = sc.nextInt();
        factorial(num);
    }
}
