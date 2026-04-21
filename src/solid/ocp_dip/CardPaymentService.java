package solid.ocp_dip;

public class CardPaymentService implements PaymentService {
    @Override
    public void pay(Order order) {
        System.out.println("[카드결제] 주문번호=" + order.getOrderId() +
                ", 상품명=" + order.getProductName() +
                ", 결제금액=" + order.getAmount());
    }
}
