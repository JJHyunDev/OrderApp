package chap3_4.OrderApp.Service;

import chap3_4.OrderApp.Food.Food;
import chap3_4.OrderApp.Order;
import chap3_4.OrderApp.payment.CardPayment;
import chap3_4.OrderApp.payment.Payment;

public class ServiceImpl implements Service {
    private final Payment payment;
    private final Food food;

    public ServiceImpl(Payment payment, Food food) {
        this.payment = payment;
        this.food = food;
    }

    public void order(Order order){
        food.cook(order);
        payment.pay(order);
    }
}
