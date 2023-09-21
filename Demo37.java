public class Demo37 {
    public static void main(String[] args) {
        Ijse ijse1 = new Ijse();
        System.out.println(ijse1.programe1);
        System.out.println(ijse1.programe2);
        ijse1 = null;
        // I can't access programe1 or programe2 anymore here

        Programe programe1 = new Gdse();
        Programe programe2 = new Dep();
        Ijse ijse2 = new Ijse(programe1, programe2);
        System.out.println(ijse2.programe1);
        System.out.println(ijse2.programe2);
        ijse2 = null;
        // I can still access programe1 or programe2
    }
}

class Ijse {
    Programe programe1;
    Programe programe2;

    public Ijse(){
        this.programe1 =  new Dep();
        this.programe2 = new Gdse();
    }

    public Ijse(Programe programe1, Programe Program2){
        this.programe1 = programe1;
        this.programe2 = programe2;
    }
}

interface Programe {}

class Dep implements Programe {}
class Gdse implements Programe {}