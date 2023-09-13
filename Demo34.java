public class Demo34 {
    public static void main(String[] args) {
        System.out.println(DEP.x);
    }
}

class IJSE{
    static int x = 10;
    static {
        System.out.println("IJSE is being initialized");
    }
}

class DEP extends IJSE{
    static {
        System.out.println("DEP is being initialized");
    }
}