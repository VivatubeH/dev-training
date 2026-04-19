package oop.step2_inheritance;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        // isBlank는 "      "도 해당됨. 반면, isEmpty는 ""만 해당.
        if (name == null || name.isBlank()) {
            // 메서드나 생성자에 전달된 인자가 잘못됐을 때 던지는 예외.
            // RuntimeException의 자식으로 언체크 예외.
            throw new IllegalArgumentException("이름은 비어 있을 수 없습니다.");
        }
        this.name = name;
    }

    public void eat() {
        System.out.println("<" + name + ">이 먹습니다.");
    }
}
