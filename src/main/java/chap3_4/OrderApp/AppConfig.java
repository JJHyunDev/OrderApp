package chap3_4.OrderApp;

import chap3_4.OrderApp.Food.Food;
import chap3_4.OrderApp.Food.Korean;
import chap3_4.OrderApp.Food.Western;
import chap3_4.OrderApp.Service.Service;
import chap3_4.OrderApp.Service.ServiceImpl;
import chap3_4.OrderApp.payment.CardPayment;
import chap3_4.OrderApp.payment.Payment;

public class AppConfig {

    public Service service(){
        return new ServiceImpl(payment(), food());
    }

    public Food food(){
        return new Korean();
    }

    public Payment payment(){
        return new CardPayment(food());
    }
}
