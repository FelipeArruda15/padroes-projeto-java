package observer.aniversarioSurpresa.observer;

public class Wife implements Observer {

    @Override
    public void update(boolean status) {
        if (status) {
            System.out.println("Let´s Party!!!");
        } else {
            System.out.println("Hold!");
        }
    }

}
