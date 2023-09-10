package observer.aniversarioSurpresa;

import observer.aniversarioSurpresa.observer.Dorman;
import observer.aniversarioSurpresa.observer.Friend;
import observer.aniversarioSurpresa.observer.Wife;

public class Client {
    public static void main(String[] args) throws Exception {
        Dorman dorman = new Dorman();
        dorman.addObserver(new Wife());
        dorman.addObserver(new Friend());

        System.out.println("Husband is comming!");
        dorman.setStatus(true);
        dorman.setStatus(false);
        dorman.setStatus(true);
    }
}
