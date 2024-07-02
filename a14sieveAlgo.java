// sieve algorithm to find prime no from 1 to n.

import java.util.Arrays;
import java.util.Scanner;

public class a14sieveAlgo {
    public static void sieveAlgo(int num){
        // if array size is 40 then we can store only 0-39 elements that's y we take arr size num+1.
        boolean arr[] = new boolean[num+1];
        Arrays.fill(arr, true);
        int counter;
        // 1 is neither prime nor composite no.
        for(counter = 2; counter<=num; counter++){
            if (arr[counter]==true) {
                for(int factor = counter+counter; factor<=num; factor+=counter){
                    arr[factor]=false;
                }
            }
        }
        for(int i=2; i<=num; i++){
            if (arr[i]==true) {
                // System.out.println(i+" "+arr[i]);
                System.out.println(i+" is a prime no.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int num = sc.nextInt();
        sieveAlgo(num);
    }
}
