package chap3_4.OrderApp.payment;

import chap3_4.OrderApp.Food.Food;
import chap3_4.OrderApp.Order;

public class CardPayment implements Payment {
    private final Food food;

    public CardPayment(Food food) {
        this.food = food;
    }

    @Override
    public void pay(Order order) {
        int amount = order.getOrderNum() * food.getPrice(order);
        System.out.println(amount + "원 카드 결제 합니다.");
    }
}
