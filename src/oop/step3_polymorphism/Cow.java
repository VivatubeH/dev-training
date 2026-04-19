package oop.step3_polymorphism;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + "가 음머 웁니다.");
    }
}
