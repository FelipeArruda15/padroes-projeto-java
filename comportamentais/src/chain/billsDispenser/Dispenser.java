package chain.billsDispenser;

public class Dispenser {

    private Bill chain;

    public Dispenser() {
        chain = new Bill(100, new Bill(50, new Bill(20, new Bill(10,
                new Bill(5, new Bill(2, new Bill(1)))))));
    }

    public Dispenser(Bill... bills) {
        for (int index = 0; index < bills.length - 1; index++) {
            Bill currentBill = bills[index];
            currentBill.setNext(bills[index + 1]);
        }
        // Caso informado somente uma nota
        chain = bills[0];
    }

    public void withdraw(Integer amount) {
        chain.execute(amount);
    }

}
