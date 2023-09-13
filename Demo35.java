public class Demo35 {
    public static void main(String[] args) {
        // MyCrazyClass crazyClass1 = new MyCrazyClass();
        // System.gc();
        // System.out.println("-----------------------");

        // crazyClass1 = null;
        // System.gc();

        // System.out.println("--------------------------");

        // new MyCrazyClass();
        // new MyCrazyClass();
        // new MyCrazyClass();
        // new MyCrazyClass();
        // new MyCrazyClass();
        // new MyCrazyClass();

        // System.gc();

        MyCrazyClassWrapper wrapper = new MyCrazyClassWrapper(new MyCrazyClass());
        System.gc();
        wrapper.crazyClass = null;
        System.gc();

        //while (true) Thread.onSpinWait();
    }
}

class MyCrazyClassWrapper {
     MyCrazyClass crazyClass;
    public MyCrazyClassWrapper(MyCrazyClass crazyClass){
        this.crazyClass = crazyClass;
    }
}

class MyCrazyClass {
    public MyCrazyClass(){
        System.out.println("I am being constructed");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Maawa adan yanna hadannea, beraganiyo...!");
    }
    
}

