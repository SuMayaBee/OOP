import java.util.*;

public class Delivery implements RoutePlanner {

    @Override
    public String calculateRoute(String from, String to) {
        return String.format("Delivery From: %s To: %s", from, to);
    }



    public void deliver(Order order) {
        calculateRoute(order.seller.address, order.buyer.getAddress());
        double totalprice = 0.0;
       for(int i=0; i<order.fruits.size(); i++) {
           Fruit fruit = order.fruits.get(i);
           double quantity = order.quantityInKg.get(i);
           fruit.setTotalQuantityKg(fruit.getTotalQuantityKg()-quantity);
           totalprice += fruit.getPricePerKg() * quantity;
       }
       order.buyer.setRewards(order.buyer.getRewards() + (0.01*totalprice));

    }
}
