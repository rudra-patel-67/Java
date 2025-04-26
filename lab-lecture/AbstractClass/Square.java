class Square extends GeoShape {
    float length;

    public Square() {
        super("Square");
        length = 0.0f;
    }

    public Square(float length) {
        super("Square");
        this.length = length;
    }

    // Deferred implementations
    @Override
    public void draw() {
        System.out.println("Drawing a Square...");
    }

    @Override
    public float getArea() {
        return length * length;
    }
}