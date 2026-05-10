class Animal {

    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat says meow");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog says woof");
    }
}

public class Program9 {

    public static void main(String[] args) {

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.sound();
        animal2.sound();
    }
}