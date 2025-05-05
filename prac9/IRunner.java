public class IRunner {
    public static void main(String[] args){
        A a = new A();
        System.out.println(a.x);
        a.m1();
        a.m2();

        System.out.println("Calling with B");

        B b = new B();
        System.out.println(b.x);
        System.out.println(b.y);
        b.m1();
        b.m2();
        b.m3();
        b.m4();
    }
}
