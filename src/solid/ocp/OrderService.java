package solid.ocp;

// DIP가 적용되지 않은 경우 : OrderService -> CardPaymentService
// DIP가 적용된 경우 : OrderService -> PaymentService <- CardPaymentService
public class OrderService {
    private final PaymentService paymentService;
    private final OrderValidator orderValidator;

    // PaymentService 인터페이스에 의존한다.
    public OrderService(PaymentService paymentService, OrderValidator orderValidator) {
        this.paymentService = paymentService;
        this.orderValidator = orderValidator;
    }

    // 주문 처리 메서드
    public void order(Order order) {
        // 주문 유효성 검사
        if (!orderValidator.isOrderValid(order)) {
            System.out.println("[주문실패] 결제금액이 올바르지 않습니다: " + order.getOrderId());
            return;
        }
        // 주문 처리 시작 메시지
        System.out.println("[주문] 주문을 처리합니다: " + order.getOrderId());
        // 결제 서비스 실행
        paymentService.pay(order);
        // 주문 완료 메시지
        System.out.println("[주문완료] 결제가 완료되었습니다: " + order.getOrderId());
    }
}
