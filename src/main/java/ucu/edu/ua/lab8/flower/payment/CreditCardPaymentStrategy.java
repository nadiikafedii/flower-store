package ucu.edu.ua.lab8.flower.payment;

public class CreditCardPaymentStrategy implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paying $" + amount + " with Credit Card.");
        return true;
    }
}

