abstract class Payment {
    public abstract void pay(int amount);
}

class CashPayment extends Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid using cash: Rp" + amount);
    }
}

class QRISPayment extends Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Paid using QRIS: Rp" + amount);
    }
}

public class Program2 {

    public static void main(String[] args) {

        Payment payment1 = new CashPayment();
        payment1.pay(50000);

        Payment payment2 = new QRISPayment();
        payment2.pay(120000);
    }
}