package observer.aniversarioSurpresa.observer;

public class Friend implements Observer {

    @Override
    public void update(boolean status) {
        if (status) {
            System.out.println("Look, I bought your favorite beer!");
        } else {
            System.out.println("Sleep...");
        }
    }

}
