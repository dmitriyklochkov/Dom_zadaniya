public class Triangle implements Shape {
    double height = 2.0;
    double side = 4.0;
    double area;

    @Override
    public double square() {
        area = height * side / 2;
        return area;
    }
}
