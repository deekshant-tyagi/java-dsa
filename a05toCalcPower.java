public class a5toCalcPower {
    static void power(int num , int power){
        double result = 1;
        for(int i=0; i<power; i++){
            result = result*num;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        power(2,3);
    }
}
