public class Cone extends Shape3D {
    private double radius;
    private double height;

    public Cone() {
        super("Cone");
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double radius, double height) {
        super("Cone");
        this.radius = radius;
        this.height = height;
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
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double getSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    protected String getPropertiesString() {
        return "radius=" + radius + ", height=" + height + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume();
    }
}
