package oop.step4_abstraction;

public class CardPayService implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원 결제합니다.");
    }
}
