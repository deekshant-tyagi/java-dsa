    // Armstrong No.
public class a4ArmstrongNo {
    static void armstrongNo(int num){
        int copy = num;
        int res = 0;
        while (num>0) {
            int digit = num%10;
            // res = res + (digit*digit*digit); //simple approach
            res = res + (int)Math.pow(digit,3);
            num = num/10;
        }
        System.out.println(copy==res);
    }
    public static void main(String[] args) {
        armstrongNo(153);
    }
}

