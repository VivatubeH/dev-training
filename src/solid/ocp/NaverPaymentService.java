package solid.ocp;

// OCP : 새로운 Pay가 추가되어도 기존의 pay 메서드는 수정할 필요가 없다.
public class NaverPaymentService implements PaymentService {
    @Override
    public void pay(Order order) {
        System.out.println("[네이버페이결제] 주문번호=" + order.getOrderId() +
                ", 상품명=" + order.getProductName() +
                ", 결제금액=" + order.getAmount());
    }
}
