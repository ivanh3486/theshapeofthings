public abstract class Shape3D implements ThreeDimensionalShape {
    protected String name;

    public Shape3D() {
        this.name = "Unknown";
    }

    public Shape3D(String name) {
        this.name = name;
    }

    @Override
    public abstract double getVolume();

    @Override
    public abstract double getSurfaceArea();

    @Override
    public String toString() {
        return name + " {" + getPropertiesString() + "}";
    }

    protected abstract String getPropertiesString();
}
