public class ShapeTest {
    public static void main(String[] args) {
        GeoShape shape = new Square(5.0f);

        System.out.println("Shape: " + shape.getName());
        shape.draw();
        System.out.println("Area: " + shape.getArea());
    }
}