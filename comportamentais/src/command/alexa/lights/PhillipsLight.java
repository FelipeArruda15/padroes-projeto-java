package command.alexa.lights;

public class PhillipsLight implements GenericLight {

    @Override
    public void turnOn() {
        System.out.println("The PhillipsLight is On");
    }

    @Override
    public void turnOff() {
        System.out.println("The PhillipsLight is Off");
    }

}
