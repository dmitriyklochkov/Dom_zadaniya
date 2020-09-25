public interface Shape {
    double area = 0.0;
    final double p = 3.14;

    default double square() {
        return area;
    }
}