package Order;

import java.util.Objects;

public class Order {

    private int id;
    private String customer;
    private String basket;
    private String orderStatus;

    public Order(int id, String customer, String basket, String orderStatus) {
        this.id = id;
        this.customer = customer;
        this.basket = basket;
        this.orderStatus = orderStatus;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBasket() {
        return basket;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                Objects.equals(customer, order.customer) &&
                Objects.equals(basket, order.basket) &&
                Objects.equals(orderStatus, order.orderStatus);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, customer, basket, orderStatus);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", basket='" + basket + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
