import java.util.Scanner;

public class a3decimalToAnyBase{
    static void decimalToAnyBase(int decimalNum,int base){
        int resNum=0;
        int power=0;
        while (decimalNum>0) {
            int rem = decimalNum%base;
            decimalNum = decimalNum/base;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        System.out.println("Result : "+resNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal no: ");
        int num = sc.nextInt();
        System.out.print("Enter Base no: ");
        int base = sc.nextInt();
        decimalToAnyBase(num,base);
    }
}

 