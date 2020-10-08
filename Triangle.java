import java.util.Scanner;

public class Triangle implements Shape {
    private double height;
    private double side;
    private double area;

    @Override
    public double square() {
        System.out.println("Введите через пробел длину стороны и высоты треугольника ");
        Scanner scanner = new Scanner(System.in);
        side = scanner.nextDouble();
        height = scanner.nextDouble();
        area = height * side / 2;
        return area;
    }
}


