public abstract class GeoShape {
    String name;

    public GeoShape() {
        name = "";
    }

    public GeoShape(String name) {
        this.name = name;
    }

    // Concrete methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract methods (Deferred Implementations)
    public abstract void draw();
    public abstract float getArea();
}