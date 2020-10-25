package Zadanie6;

import java.util.Scanner;

public class Orange {
    private float weight = 1.5f;
    private int size = 3;
    private float weightBox;

    void box() {
        System.out.println("Введите количество апельсинов");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
    }

    void getWeight() {
        weightBox = weight * size;
    }
}
