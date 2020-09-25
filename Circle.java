public class Circle implements Shape {
    double radius = 4.0;
    double area;

    @Override
    public double square() {
        area = (Shape.p * radius * radius);
        return area;
    }
}
