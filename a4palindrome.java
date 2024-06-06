import java.util.Scanner;

public class a4palindrome {
    
    static void palindrome(int num){
        int x = num;
        int revNum = 0;
        while(num>0){
            revNum = (revNum*10) + (num%10);
            num = num/10;
        }
        // System.out.println(revNum); to Check reverse no.
        if (revNum==x) {
            System.out.println("Palindrome No");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        palindrome(num);
    }
}