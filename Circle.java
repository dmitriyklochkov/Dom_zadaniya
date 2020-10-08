import java.util.Scanner;

public class Circle implements Shape {
    private double radius;
    private double area;

    @Override
    public double square() {
        System.out.println("Введите радиус круга ");
        Scanner scanner = new Scanner(System.in);
        radius = scanner.nextDouble();
        area = (Math.PI * radius * radius);
        return area;
    }
}
