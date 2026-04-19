package oop.step4_abstraction;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new KakaoPayService();
        OrderService orderService = new OrderService(paymentService);
        orderService.order(10000);
    }
}
