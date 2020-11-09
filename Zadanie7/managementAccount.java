package Zadanie7;

import java.util.Scanner;

public class managementAccount extends Account implements AccountService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account acc = new Account();
        AccountService service = new AccountService();
        System.out.println("Введите  команду balance [id], withdraw [id] [amount],deposite [id] [amount] или transfer [from] [to] [amount]");
        String order = scanner.nextLine();
        if (order == "balance")
            acc.id = scanner.nextInt();

        void balance (id)
    }
}
