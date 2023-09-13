public interface Demo31 {

    // We can have static methods in interfaces since Java 8
    // We can have default methods (methods that have implementation) since Java 8
    // We can have private methods in interfaces since Java 9
    public static void main(String[] args) {
        System.out.println("Hello World! This is an interface");
    }

    private void myMethod(){

    }

    private static void myMethod2(){

    }

    // private, protected access modifer can't be used with default methods
    // default methods are just like abstract methods when it comes to access modifers
    // default methods are still instance methods
    default void myMethod3(){

    }

    // Interfaces can't hold variables
    // Interfaces only contain constants
    // public static final int x = 10;
    // private, protected access modifer can't be used with constants in interfaces
    int myConst = getValue();    // This is implicitly public static final

    public static int getValue(){
        return 10 + 15;
    }
}

