package Computer;

import java.util.Scanner;

public class Computer {
    static protected int strategiy;

    public static void main(String[] args) {
        System.out.println("Если предназначение компьютера офисное, введите 0, если игровое, введите любую цифру");
        Scanner scanner = new Scanner(System.in);
        strategiy = scanner.nextInt();
        ComputerFacade facade = new ComputerFacade();
        facade.start();
    }
}
