package Ironhack.com;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private String orderId;
    private String customer;
    private List<OrderItem> items;
    private BigDecimal total;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Order(String orderId, String customer, List<OrderItem> items, BigDecimal total) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", customer='" + customer + '\'' +
                ", items=" + items +
                ", total=" + total +
                '}';
    }
}
