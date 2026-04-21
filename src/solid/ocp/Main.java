package solid.ocp;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("ORD-1001", "맥북 파우치", 39000);
        OrderValidator orderValidator = new OrderValidator();
        OrderService orderService1 = new OrderService(new CardPaymentService(), orderValidator);
        orderService1.order(order1);

        System.out.println();

        Order order2 = new Order("ORD-1002", "기계식 키보드", 129000);
        OrderService orderService2 = new OrderService(new KakaoPaymentService(), orderValidator);
        orderService2.order(order2);

        Order order3 = new Order("ORD-1003", "실패 케이스", -100);
        orderService1.order(order3);

    }
}
