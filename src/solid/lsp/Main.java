package solid.lsp;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow("참새");
        Penguin penguin = new Penguin("펭귄");

        sparrow.fly();
        System.out.println("[새] " + penguin.getName());

        Flyable flyable = new Eagle("독수리");
        flyable.fly();

        Ostrich ostrich = new Ostrich("타조");
        System.out.println("[새] " + ostrich.getName());
    }
}
