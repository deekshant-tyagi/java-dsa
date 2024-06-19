
    // Binary to Decimal
import java.util.Scanner;
public class a3BinaryToDecimal {
    static void BinaryToDecimal(int binaryNum,int base){
        int resNum=0;
        int power=0;
        while (binaryNum>0) {
            int rem = binaryNum%base;
            resNum += rem * Math.pow(2, power);
            binaryNum = binaryNum/base;
            power++;
        }
        System.out.println("Result : "+resNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary no: ");
        int BinNum = sc.nextInt();
        // System.out.print("Enter Base no: "); if u want to change any base to decimal like octal to decimal so u can ask from user the base value.
        // int base = sc.nextInt();
        BinaryToDecimal(BinNum,10);
    }
}

