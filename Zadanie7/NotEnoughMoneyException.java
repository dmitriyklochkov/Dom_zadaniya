package Zadanie7;

public class NotEnoughMoneyException extends Exception {
    public void NotEnoughMoneyException(String message) {
        System.out.println("На счете не достаточно средств");
    }
}
