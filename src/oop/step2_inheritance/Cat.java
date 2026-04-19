package oop.step2_inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public void meow() {
        System.out.println("<" + getName() + ">가 야옹 웁니다.");
    }
}
