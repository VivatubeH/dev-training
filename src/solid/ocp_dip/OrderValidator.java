package solid.ocp_dip;

public class OrderValidator {
    public boolean isOrderValid(Order order) {
        return order.getAmount() > 0;
    }
}
