public class Sphere extends Shape3D {
    private double radius;

    public Sphere() {
        super("Sphere");
        this.radius = 0.0;
    }

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    protected String getPropertiesString() {
        return "radius=" + radius + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume();
    }
}
