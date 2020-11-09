package Shapes;

import java.util.Scanner;

public class Rectangle implements Shape {
    private double side1 = 2.0;
    private double side2 = 4.0;
    private double area;

    @Override
    public double square() {
        System.out.println("Введите через пробел длины сторон прямоугольника");
        Scanner scanner = new Scanner(System.in);
        side1 = scanner.nextDouble();
        side2 = scanner.nextDouble();
        area = side1 * side2;
        return area;
    }
}


