public class a19bitManipulation {
    public static void main(String[] args) {
        // printBits(54);
        // isOddEven(1434);
        // isBitSet(54, 4);
        // setIthBit(32, 1);
        // toggleIthBit(32, 2);
        // unsetIthBit(37, 2);
        // isPowerOfTwo(18);
        // unsetRightMostSetBit(6);
        // noOfSetBits(4);
}
    
    static void printBits(int num){
        //we represent it in 8 bit -> 0to7
        for(int i=7; i>=0; i--){
            // int res = ((num>>i)&1);
            // System.out.print(res);

            System.out.print(((num>>i)&1));
        }
    }

    // Simple way
    // static void isOddEven(int num){
    //     int res = num&1;
    //     if (res==0) {
    //         System.out.println("even");
    //     }
    //     else{
    //         System.out.println("odd");
    //     }
    // }

    static void isOddEven(int num){
        if (isBitSet(num,0)) { // ith(lsb) bit is 1
            System.out.println(num+" is Odd.");
        }
        else{
            System.out.println(num+" is Even.");
        }
    }

    static boolean isBitSet(int num,int bit){
    // here it goes from 0-1-2-3-4-5
        int res = num & (1<<bit); // i.e = 1<<0 means nothing but 1 only.
        // the above code is good , it will only tell us the ans in the form of true of false , if bit set then true otherwise false, but is we print the bit then it will print it in decimal form.
        //so below code is better
        // 1->Set and 0->Not Set.
             //     if (res==0) {
            //         System.out.println("Not Set");
            //     }
            //     else{
            //         System.out.println("Set");
            //     }
        return (res==0)?false:true;
    }

    // here it goes from 1-2-3-4-5
    // public static boolean isBitSet(int num, int bit){
    //     int res = (num>>(bit-1))&1;
    //     if (res==0) {
    //         System.out.println("Not Set");
    //     }
    //     else{
    //         System.out.println("Set");
    //     }
    // }

    static void setIthBit(int num,int bit){
        int res = num | (1<<bit);
        printBits(res);
    }

    // xor ^ 00=0 11=0 01=1 10=1
    static void toggleIthBit(int num,int bit){
        int res = num ^ (1<<bit);
        printBits(res);
    }

    // ~ tilde similar like one's compliment.
    static void unsetIthBit(int num,int bit){
        int res = num & ~(1<<bit);
        printBits(res);
    }

    static void isPowerOfTwo(int num){
        //(n>0 && (n&n-1)==0) for 0 case as 0 isn't a power of two.
        if ((num & (num-1)) ==0) { 
            System.out.println(num+" is power of two.");
        }
        else{
            System.out.println(num+" isn't power of two.");
        }
    }

    static int unsetRightMostSetBit(int num){
        int res = num & (num-1);
        // printBits(res);
        return res;
    }

    static void noOfSetBits(int num){
        int count = 0;
        while (num!=0) {
            num = unsetRightMostSetBit(num);
            count++;
        }
        System.out.println(count);
    }    

    //leetcode 191
    // class Solution {
    //     static int unsetRightMostSetBit(int num){
    //         int res = num & (num-1);
    //         return res;
    //     }
    //     public int hammingWeight(int n) {
    //         int count = 0;
    //         while(n!=0){
    //             n = unsetRightMostSetBit(n);
    //             count++;
    //         }
    //         return count;
    //     }
    // }
}
