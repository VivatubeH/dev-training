package oop.step3_polymorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + "가 멍멍 짖습니다.");
    }
}
