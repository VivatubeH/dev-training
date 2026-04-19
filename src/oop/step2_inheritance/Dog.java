package oop.step2_inheritance;

public class Dog extends Animal {
    public Dog(String name) {
//        this.name = name; // 부모의 private 필드는 자식이 직접 접근 X
        super(name); // super는 필드에 직접 접근 X, 부모 클래스의 생성자 호출
    }
    public void bark() {
        System.out.println("<" + getName() + ">이 멍멍 짖습니다.");
    }
}
