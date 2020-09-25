public class Rectangle implements Shape {
    private double side1 = 2.0;
    private double side2 = 4.0;
    private double area;

    @Override
    public double square() {
        area = side1 * side2;
        return area;
    }
}


