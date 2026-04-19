package oop.step4_abstraction;

public interface PaymentService {
    // 인터페이스의 일반 메서드는 public abstract가 생략된다.
    void pay(int amount);

    // 자바 8부터는 default 메서드를 인터페이스 내에 쓸 수 있다.
    // 구현부가 있어 구현 클래스가 그대로 물려받아 쓸 수 있고
    // 필요 시 오버라이딩도 가능하다.
    default void printInfo() {
        System.out.println("결제 서비스입니다.");
    }

    // 인터페이스 이름으로 호출되는 static 메서드이다.
    // 구현부는 있고, 구현 클래스가 물려받는 개념은 아니다.
    // 용도 : 인터페이스 자체와 관련된 보조 기능, 유틸처럼 제공
    static void hello() {
        System.out.println("안녕하세요");
    }

    // private 메서드는 구현부가 있고 인터페이스 내부에서만 쓰는 헬퍼 메서드이다.
    // 바깥이나 구현 클래스에서 호출을 할수는 없다.
    // 용도 : 코드 중복을 예방할 수 있음.
    private void validate() {
        System.out.println("인터페이스에 숨겨진 메서드입니다.");
    }
}
