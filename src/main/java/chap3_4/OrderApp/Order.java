package chap3_4.OrderApp;

public class Order {
    private String Course;
    private String payment;
    private int orderNum;


    public Order(String course, int orderNum) {
        this.Course = course;
        this.orderNum = orderNum;
        this.payment = payment;
    }

    public String getCourse() {
        return Course;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public String getPayment() {
        return payment;
    }
}
