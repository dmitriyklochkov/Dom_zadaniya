package Zadanie6;

import java.util.Scanner;

public class Orange {
    private float weight = 1.5f;
    private int size = 3;
    protected static float weightBox;
    MyArrayCollection<Orange> boxOrange = new MyArrayCollection<>();

    protected void box() {
        System.out.println("Введите количество апельсинов");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
    }

    protected void getWeight() {
        weightBox = weight * size;
    }
}
