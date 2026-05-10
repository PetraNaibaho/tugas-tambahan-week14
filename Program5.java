interface Switchable {
    void turnOn();
    void turnOff();
}

class Lamp implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Lamp is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("Lamp is OFF");
    }
}

class Button {
    private Switchable device;

    public Button(Switchable device) {
        this.device = device;
    }

    public void pressOn() {
        device.turnOn();
    }

    public void pressOff() {
        device.turnOff();
    }
}

public class Program5 {

    public static void main(String[] args) {

        Lamp lamp = new Lamp();

        Button button = new Button(lamp);

        button.pressOn();
        button.pressOff();
    }
}