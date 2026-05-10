interface Keyboard {
    void type();
}

class MechanicalKeyboard implements Keyboard {

    @Override
    public void type() {
        System.out.println("Typing using mechanical keyboard");
    }
}

class Laptop {
    private Keyboard keyboard;

    public Laptop(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void startTyping() {
        keyboard.type();
    }
}

public class Program4 {

    public static void main(String[] args) {

        Keyboard keyboard = new MechanicalKeyboard();

        Laptop laptop = new Laptop(keyboard);

        laptop.startTyping();
    }
}