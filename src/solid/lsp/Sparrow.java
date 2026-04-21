package solid.lsp;

// 참새는 새라는 공통 정보를 가지면서 날 수 있는 기능을 구현한다.
public class Sparrow extends Bird implements Flyable {
    // 부모가 name을 받는 생성자가 있고, private 필드이므로
    // 부모의 생성자를 호출해서 초기화한다.
    public Sparrow(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println("[비행] " + getName() + "이(가) 하늘을 납니다.");
    }
}
