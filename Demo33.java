public class Demo33 {

    public static void main(String[] args) {
        MyAwesomeClass awesomeInstance = new MyAwesomeClass();
        System.out.println(awesomeInstance instanceof MyMarkerInterface);

        MyFun myFun = (x) -> x * x + 2 * x + 1;
        System.out.println(myFun.execute(10));
        System.out.println(myFun.execute(20));
        System.out.println(myFun.execute(5));
        System.out.println(myFun.execute(2));

        F f = (x, y) -> x * x + y * y;
        System.out.println(f.execute(3, 4));
        System.out.println(f.execute(5, 2));
    }

}

@FunctionalInterface
interface F {
    int execute(int x, int y);
    //int abc();
    static void doSomething(){}
}

interface MyFun {
    int execute(int x);
}

interface MyMarkerInterface {
    // Marker interfaces are empty
}

class MyAwesomeClass implements MyMarkerInterface {

}

@FunctionalInterface // Lambdas
interface MyFunctionalInterface {
    void myOnlyAbstractMethod();
    // void myOnlyAbstractMethod2();

    static void myStaticMethod() {
    }

    default void myDefaultMethod() {
    }
}
