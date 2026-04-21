package solid.ocp;

public interface PaymentService {

    // 주문 정보를 전달받아 결제를 처리하는 메서드
    void pay(Order order);
}
