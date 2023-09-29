public class Cylinder extends Shape3D {
    private double radius;
    private double height;

    public Cylinder(String name,double radius, double height) {
        super(name);
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(double v, double radius) {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralArea = 2.0 * Math.PI * radius * height;
        return 2.0 * baseArea + lateralArea;
    }

    @Override
    protected String getPropertiesString() {
        return "radius=" + radius + ", height=" + height + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume();
    }
}
