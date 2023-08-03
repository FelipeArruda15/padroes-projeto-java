package chain.billsDispenser;

public class Client {

    public static void main(String[] args) {
        Dispenser atm = new Dispenser();
        atm.withdraw(278);
        System.out.println("-----------");
        atm.withdraw(877);

        Dispenser customDispenser = new Dispenser(new Bill(256), new Bill(128), new Bill(64), new Bill(32),
                new Bill(16), new Bill(8), new Bill(4), new Bill(2), new Bill(1));
        System.out.println("Withdrawing $230...");
        customDispenser.withdraw(230);
        System.out.println("Withdrawing $1589...");
        customDispenser.withdraw(1589);
    }

}
