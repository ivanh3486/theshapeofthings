public class Cube extends Shape3D {
    private double side;

    public Cube() {
        super("Cube");
        this.side = 0.0;
    }

    public Cube(double side) {
        super("Cube");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6.0 * Math.pow(side, 2);
    }

    @Override
    protected String getPropertiesString() {
        return "side=" + side + ", surface area=" + getSurfaceArea() + ", volume=" + getVolume();
    }
}
