public class ShapeDemo {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0, 4.0);
        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(5.0);
        Cone cone = new Cone(3.0, 6.0);

        System.out.println(cylinder);
        System.out.println(sphere);
        System.out.println(cube);
        System.out.println(cone);
    }
}
