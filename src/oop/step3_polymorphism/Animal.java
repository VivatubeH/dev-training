package oop.step3_polymorphism;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sound(); // 선언부만 존재하는 추상 메서드
}
