import java.util.Scanner;

public class a15newtonRaphsonSqRoot {
    public static double newtonRaphsonAlgo(int num){
        double tol = 0.001;
        double root;
        double X=num;
        while (true) {
            root = 0.5 * (X+(num/X));
            double ans = X-root;
            if (ans<tol) {
                break;
            }
            X=root;
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no to find sq root: ");
        int num = sc.nextInt();
        int result = (int)newtonRaphsonAlgo(num);
        // double result = newtonRaphsonAlgo(num);
        System.out.println("Sq root of a number is: "+result);
        
    }
}
