public class Circle implements Shape {
    private double radius = 4.0;
    private double area;

    @Override
    public double square() {
        area = (Shape.p * radius * radius);
        return area;
    }
}
