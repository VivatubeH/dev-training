package oop.step4_abstraction;

public class OrderService {
    // PaymentService는 생성 후 바뀌지 않는다.
    // 따라서, final로 둘 수 있음.
    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void order(int amount) {
        System.out.println("주문을 요청합니다.");
        paymentService.pay(amount);
    }
}
