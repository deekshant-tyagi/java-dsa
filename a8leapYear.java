import java.util.Scanner;

public class a8leapYear {
    static void leapYear(int year){
        // (year%400==0)- It is century leap year
        // year%4==0 && year%100!=0- It is leap year and not century year
        if((year%400==0)||(year%4==0 && year%100!=0)){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = sc.nextInt();
        leapYear(year);
    }
}


// Generate Multiplication Table.

// import java.util.Scanner;

// public class a8leapYear {
//     static void mulTable(int num){
//         for(int i=1; i<=10; i++){
//             System.out.println(num+" x "+i+" = "+num*i);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter No : ");
//         int num = sc.nextInt();
//         mulTable(num);
//     }
// }
