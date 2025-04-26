public class InterfaceTest {
    public static void main(String[] args) {
        A a1 = new A();

        // Class A's own methods
        a1.m1();
        a1.m2();

        // Interface methods
        a1.m3();
        a1.m4(10, 20.5f);
    }
}