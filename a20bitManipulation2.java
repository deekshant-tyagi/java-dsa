public class a20bitManipulation2 {
    public static void main(String[] args) {
        // printBits(53);
        // clearLSB(53, 4);
        // clearMSB(53, 4);
        // clearMSBExclusive(53, 4);
        // convertCharToLowerCase('A');
        // convertCharToUpperCase('a');
        // swap(-4, 5);
        // int arr[] = {2,4,2,6,3,3,1,1,6};
        // printOnlyUniqueElements(arr);
        // int arr1[] = {2,4,2,6,3,3,1,1};
        // printTwoUniqueElements(arr1);


    }

    static void printBits(int num){
        for(int i=7; i>=0; i--){
            System.out.print((num>>i)&1);
        }
        System.out.println();
    }


    // clearLSB -> unset the bits
    static void clearLSB(int num,int bit){
        int res = num & ~((1<<(bit+1))-1);
        printBits(res);
    }


    static void clearMSB(int num,int bit){
        int res = num & ((1<<bit)-1);
        printBits(res);
    }

    static void clearMSBExclusive(int num,int bit){
        // 4th term excluded.
        int res = num & ((1<<(bit+1))-1);
        printBits(res);
    }


    static void convertCharToUpperCase(int num){
        // char res = (char)(num & ~(1<<5));
        char res = (char)(num & '_');
        System.out.println(res);
    }

    static void convertCharToLowerCase(int num){
        // char res = (char)(num | (1<<5));
        char res = (char)(num | ' '); //' ' ascii value is 32.
        // (1<<5) and 32 are equivalent.
        System.out.println(res);
    }


    static void swap(int num1,int num2){
        System.out.println("Num1:"+num1+" , Num2:"+num2);
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("Num1:"+num1+" , Num2:"+num2);
    }

    static void printOnlyUniqueElements(int arr[]){
        int l = arr.length;
        int res = 0; // or we can take 1st array element.
        for(int i=0; i<l; i++){
            res = res ^ arr[i];
        }
        System.out.println(res);
    }

    
    public static void printTwoUniqueElements(int arr[]){
        int l = arr.length;
        int res = 0;

        // here we r finding the remaining elements.
        for(int i=0;i<l;i++){
            res = res ^ arr[i];
        }

        int setBit=0;
        int bit = 0;

        // checking at which pos rightMost bits are set 
        while (res !=0){
            if ((res>>bit & 1)!=0){
                setBit = bit;
                break;
            }
            bit++;
        }
        int res1 = 0;

        // making a group of bits which are set at setBit position.
        for(int i=0;i<l;i++){
            if((arr[i] >> setBit & 1 )!=0)
                res1 = res1 ^ arr[i];
        }

        int num1 = res ^ res1;
        int num2 = num1 ^ res;

        System.out.println("Num1: "+num1+", num2: "+num2);
    }

}
