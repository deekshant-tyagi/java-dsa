import java.util.*;
public class a9SumOfDigits {
    static void sumOfDigits(int num){
        int res=0;
        while (num>0) {
            res = res + num%10;
            num/=10;
        }
        System.out.println("Total Sum : "+res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int num = sc.nextInt();
        sumOfDigits(num);
    }
}
