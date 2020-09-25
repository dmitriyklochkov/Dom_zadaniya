public class Rectangle implements Shape {
    double side1 = 2.0;
    double side2 = 4.0;
    double area;

    @Override
    public double square() {
        area = side1 * side2;
        return area;
    }
}


