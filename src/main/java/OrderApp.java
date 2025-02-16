import chap3_4.OrderApp.AppConfig;
import chap3_4.OrderApp.Order;
import chap3_4.OrderApp.Service.Service;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        Service service = appConfig.service();
        Order order = new Order("courseB", 3);

        service.order(order);
    }
}