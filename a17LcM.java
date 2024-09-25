public class a17LcM {
    static int effEuclideanGCD(int num1,int num2){
        int res;
        while (num1!=0 && num2!=0) {
            if (num1>num2) {
                num1%=num2;
            }
            else{
                num2%=num1;
            }
        }
        res = num1;
        if(num1==0){
            res=num2;
        }
        return res;
    }

    static void lcm(int num1,int num2){
        int resLcm = (num1*num2)/effEuclideanGCD(num1, num2);
        System.out.println("LCM is : "+resLcm);
    }
    public static void main(String[] args) {
        lcm(24, 36);
    }
}
