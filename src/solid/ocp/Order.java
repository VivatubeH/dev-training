package solid.ocp;

// 주문 정보 클래스
public class Order {
    private final String orderId; // 주문번호
    private final String productName; // 상품명
    private final int amount; // 결제금액

    public Order(String orderId, String productName, int amount) {
        this.orderId = orderId;
        this.productName = productName;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public String getOrderId() {
        return orderId;
    }

    public int getAmount() {
        return amount;
    }
}
