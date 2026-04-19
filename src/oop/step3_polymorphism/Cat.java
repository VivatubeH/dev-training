package oop.step3_polymorphism;

public class Cat extends Animal {
    // 부모의 생성자를 호출한다.
    // 부모의 생성자 코드는 Animal 클래스 내에 있어서 private 이어도 접근이 가능.
    public Cat(String name) {
        super(name);
    }
    @Override
    public void sound() {
        System.out.println(getName() + "가 야옹 웁니다.");
    }
}
