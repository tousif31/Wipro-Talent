class A extends C {
    @Override
    public String display() {
        return "This is an instance of class A";
    }
}
class B extends A {
    @Override
    public String display() {
        return "This is an instance of class B, which extends A";
    }
}
interface I {
    String display();
}


abstract class C {
    public abstract String display();
}

public class OOPS implements I {

    @Override
    public String display() {
        return "This is an instance of class OOPS implementing interface I";
    }

    public static void main(String[] args) {
        OOPS oops = new OOPS();
        System.out.println(oops.display());

        A a = new A();
        System.out.println(a.display());

        B b = new B();
        System.out.println(b.display());

        C c = new B(); // Polymorphism
        System.out.println(c.display());
        OOPS oops2 = new OOPS(); // Instance of OOPS implementing I
        System.out.println(oops2.display());
    }
}   