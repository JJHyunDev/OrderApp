package chap3_4.OrderApp.Food;

import chap3_4.OrderApp.Order;

public interface Food {
    public void cook(Order order);
    public int getPrice(Order order);
}
