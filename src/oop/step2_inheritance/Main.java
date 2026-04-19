package oop.step2_inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("초코");
        dog.eat();
        dog.bark();

        Cat cat = new Cat("나비");
        cat.eat();
        cat.meow();
    }
}
