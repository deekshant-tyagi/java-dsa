/**
 * a2asciiValue
 */
import java.util.*;
public class a2asciiValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        String input = sc.next();
        char ch = input.charAt(0);
        int res = (int)ch;
        System.out.println(res);

    }
}