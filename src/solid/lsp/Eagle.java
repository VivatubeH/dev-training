package solid.lsp;

// 독수리는 새도 맞고, 날 수도 있다.
public class Eagle extends Bird implements Flyable {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("[비행] " + getName() + "이(가) 높이 납니다.");
    }
}
