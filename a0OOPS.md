<!-- OOPS CONCENT OF JAVA -->

1.INTERFACE
2.ABSTRACT
3.METHOD OVERLOADING
4.METHOD OVERRIDING
5.POLYMORPHISM(NothiNg but the implementation of Method Overloading OR Method Overriding)
6.ENCAPSULATION


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

