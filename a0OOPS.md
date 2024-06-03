view RAW file :)

<!-- OOPS CONCEPT OF JAVA -->

1.INTERFACE
2.ABSTRACT
3.METHOD OVERLOADING
4.METHOD OVERRIDING
5.POLYMORPHISM(NothiNg but the implementation of Method Overloading OR Method Overriding)
6.ENCAPSULATION
7.try and catch in JAVA
8.MultiCatch Blocks in JAVA(With shortcut)
9.Nested TryCatch
10.TryCatchFinally
11.Throw in JAVA
12.Throws in Java
13.User Defined Exception


<!-- INTERFACE in JAVA -->
interface Car{
    public void start();
}
class electricCar implements Car{
    public void start(){
        System.out.println("Electric Car Starts.");
    }
}
class dieselCar implements Car{
    public void start(){
        System.out.println("Diesel Car Starts.");
    }
}
    public class demo {

        public static void main(String[] args) {
            Car tesla = new electricCar();
            Car polo = new dieselCar();
            tesla.start();;
            polo.start();;
        }
}

<!-- ABSTRACT in JAVA -->
abstract class car{
    // like a user view.
    abstract void fuelType();
}
class tata extends car{
    //hidden implementation (backend)
    void fuelType(){
        System.out.println("Diesel");
    }
}
public class demo {

    public static void main(String[] args) {
        tata nexon = new tata();
        nexon.fuelType();
    }
}

<!-- METHOD(Function) OVERRIDING -->
class Bank{
    void rateOfInteres(){
        System.out.println("Rate of Interest of Bank is 5%");
    }
}
class PNB extends Bank{
    @Override // good practice if we use this.
    void rateOfInteres(){
        System.out.println("Rate of Interest of PNB is 6%");
    }
}
class SBI extends Bank{
    void rateOfInteres(){
        System.out.println("Rate of Interest of SBI  is 7%");
    }
}
public class demo {
    public static void main(String[] args) {
        Bank obj = new Bank();
        PNB obj1 = new PNB();
        SBI obj2 = new SBI();
        obj.rateOfInteres();
        obj1.rateOfInteres();
        obj2.rateOfInteres();
    }    
}
<------------OR-------------->

final class a{
    void message(){
        System.out.println("welcome to base class.");
    }
}
class b extends a{
    void message(){
        System.out.println("welcome to derived class.");
    }
}
public class demo {
    public static void main(String[] args) {
        b obj = new b();
        obj.message();
    }  
}
// if we want to prevent method overriding then we can use the final keyword on function. After using final keyword we can't make two function of same name.

<!-- METHOD(Function) OVERLOADING -->
class overloadingDemo{
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void sum(String a, String b){
        System.out.println(a+b);
    }
}
public class demo {
    public static void main(String[] args) {
        overloadingDemo obj = new overloadingDemo();
        obj.sum(4, 4);
        obj.sum(5, 5,9);
        obj.sum("hello", "World");
    }    
}

<!-- ENCAPSULATION in JAVA -->
class person{
    private String name;
    private int age;
    // this refers to current context , or current parent (not compulsory to use this its optional) .
    void setAge(int ageOfStudent){
        this.age = ageOfStudent;
    }
    int getAge(){
        return age;
    }
    void setName(String nameOfStudent){
        this.name = nameOfStudent;
    }
    String getName(){
        return name;
    }
}
public class demo {

    public static void main(String[] args) {
        person obj = new person();
        obj.setName("helloWorld");
        obj.setAge(15);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}


<!--  try and catch in JAVA-->
// try block must be followed by catch or finally block.
import java.util.*;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        try {
            int result = dividend / divisor;
            System.out.println("your answer is: "+result);
        } catch (Exception e) {
            System.out.println(e);
        }
    }  
}
//O/P
//10/0 gives us exception -> java.lang.ArithmeticException: / by zero

<!--  MultiCatch Blocks in JAVA-->
public class demo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            int res = arr[6]=10/2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
// O/P->java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5

<!-- Shortcut for Catch block -->
    catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }

<!-- Nested TryCatch -->
public class demo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            System.out.println("I am in First try Block.");
            try {
                arr[6] = 10;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                <!-- getMessage()->Returns the detail message string of this Exception. -->
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
// O/P
// I am in First try Block.
// Index 6 out of bounds for length 5


<!-- TryCatchFinally -->
<!--Finally Block will always execute. -->
public class demo {
public static void main(String[] args) {
    try {
        int data = 25/5;
        System.out.println("Inside Try Block");
    } catch (Exception e) {
        System.out.println("Inside Exception Block");
    } finally{
        System.out.println("Inside Finally Block");
    }
} 
}
// O/P 
// Inside Try Block
// Inside Finally Block


<!-- Throw in JAVA -->
<!-- Throw is used to throw the exception explicitly. -->
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age<18) {
            throw new RuntimeException("You Can't Vote");
        } else {
            System.out.println("You Can Vote.");
        }
    }
}
// O/P
//Exception in thread "main" java.lang.RuntimeException: You Can't Vote at demo.main(demo.java:10)

<!-- Throws in Java -->
<!-- Throws doesn't throw an exception but is used to declare exception , it indicates that an exception might occur in program or method. -->
public class demo {
    static void divisionDemo(int dividend, int divisor) throws ArithmeticException{
        System.out.println(dividend/divisor);
    }
    public static void main(String[] args) {
        divisionDemo(10, 0);
    }
}

<!-- User Defined Exception -->
//super()=> produces specified detail message.
class limitExceedException extends Exception{
    limitExceedException(String msg){
        // super(msg);

        System.out.println(msg);
    }
}
public class demo {
    static void withdrawMoney(int money) throws limitExceedException{
        if (money<10000) {
            throw new limitExceedException("Your total withdrawal limit exceeded");
        }
        else{
            System.out.println("Successfully, Withdrawal Completed");
        }
    }
    public static void main(String[] args) {
        try {
            withdrawMoney(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//O/P
// Your total withdrawal limit exceeded
// limitExceedException
// if we use super=> limitExceedException: Your total withdrawal limit exceeded
