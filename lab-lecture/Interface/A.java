public class A implements Int1 {
    // Own Methods
    public void m1() {
        System.out.println("Own method m1()");
    }

    public void m2() {
        System.out.println("Own method m2()");
    }

    // Deferred Implementations (from Int1)
    @Override
    public void m3() {
        System.out.println("Implemented m3()");
    }

    @Override
    public void m4(int a, float b) {
        System.out.println("Implemented m4() with parameters: " + a + ", " + b);
    }
}