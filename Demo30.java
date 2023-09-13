import java.io.Serializable;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo30 {
    public static void main(String[] args) {
        
    }
}

abstract class MyAbstractClass {
    protected abstract void myMethod(); // Protected can be used with abstract methods in abstract classes
    abstract void myMethod2(); // Package Private can be used with abstract methods in abstract classes
}

// Interfaces are implicitily abstract & static 
abstract interface MyInterface { // IMyInterface
    //public abstract void myMethod();
    abstract void myMethod();   // This is still a public method
    // protected abstract void myMethod1();   // Protected can't be used with abstract methods in interface
}

interface MyInterface2 extends MyInterface, Serializable, Consumer{
    void myMethod2();
}

abstract class MyConcrectClass implements MyInterface2, Runnable, BiFunction {

    @Override
    public void myMethod() {}

    @Override
    public void myMethod2() {}

    @Override
    public void accept(Object t) {}

    @Override
    public void run() {}

}
