package observer.aniversarioSurpresa.observer;

public class Dorman extends Subject {

    private boolean status = false;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean newStatus) {
        if (status != newStatus) {
            this.status = newStatus;
            notifyObservers(newStatus);
        }
    }

}
