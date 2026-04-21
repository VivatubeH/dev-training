package solid.lsp;

// Penguin은 Bird를 상속하지만 Flyable은 구현 X
// 즉 날 수 없는 새이다.
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }
}
