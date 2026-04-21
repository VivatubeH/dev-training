package solid.ocp;

public class OrderValidator {
    public boolean isOrderValid(Order order) {
        return order.getAmount() > 0;
    }
}
