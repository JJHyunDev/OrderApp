package chap3_4.OrderApp.Food;

import chap3_4.OrderApp.Order;

public class Japanese implements Food {

    private final int courseA = 11000;
    private final int courseB = 16000;

    public Japanese() {
    }

    @Override
    public void cook(Order order) {
        System.out.println("일식 요리 " + order.getOrderNum() + "개 요리합니다.");
    }

    @Override
    public int getPrice(Order order) {
        if(order.getCourse().equals("courseA")){
            return courseA;
        }else if(order.getCourse().equals("courseB")){
            return courseB;
        }else{
            throw new IllegalArgumentException("유효하지 않은 course명 입니다." + order.getCourse());
        }
    }
}
