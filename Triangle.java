public class Triangle implements Shape {
    private double height = 2.0;
    private double side = 4.0;
    private double area;

    @Override
    public double square() {
        area = height * side / 2;
        return area;
    }
}


