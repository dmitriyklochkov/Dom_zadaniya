package Zadanie7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class ManagementAccount extends Account implements AccountService {

   static int  sum;


    @Override
    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        System.out.println("Снятие со счета " + accountId + " суммы" + sum);
    }

    @Override
    public void balance(int accountId) throws UnknownAccountException {
        System.out.print("По счету "+accountId+ " остаток " );
    }

    @Override
    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        System.out.print("Внесение на счет " + accountId + " суммы" + sum);
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {

    }

    public static void main(String[] args) throws UnknownAccountException, NotEnoughMoneyException {
        Scanner scanner = new Scanner(System.in);
        Account acc = new Account();
        ManagementAccount managementAccount=new ManagementAccount();
        System.out.println("Введите  команду balance [id], withdraw [id] [amount],deposit [id] [amount] или transfer [from] [to] [amount]");
        String order = scanner.nextLine();
        switch (order) {
            case ("balance"): {
                acc.accountId = scanner.nextInt();
                managementAccount.balance(acc.accountId);
                break;
            }

            case ("withdraw"): {
                acc.accountId = scanner.nextInt();
                sum = scanner.nextInt();
                managementAccount.withdraw(managementAccount.accountId, sum);
            }
            case ("deposit"):{
                acc.accountId =scanner.nextInt();
                sum = scanner.nextInt();
                managementAccount.deposit(managementAccount.accountId,sum);
            }
            case ("transfer"):{
                acc.accountId =scanner.nextInt();
                int IdTo = scanner.nextInt();
                sum= scanner.nextInt();
                managementAccount.withdraw(managementAccount.accountId, sum);
                managementAccount.deposit(IdTo,sum);
            }
        }
    }
}
