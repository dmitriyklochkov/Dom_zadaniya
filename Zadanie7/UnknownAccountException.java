package Zadanie7;

public class UnknownAccountException extends Exception {
    public void UnknownAccountException(String message) {
        System.out.println("Аккаунт не найден");
    }
}
