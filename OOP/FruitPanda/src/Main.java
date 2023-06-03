import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Apple", "Himshagor",100, 150);
        Fruit fruit2 = new Fruit("Orange", "Chinese", 120, 200);
        ArrayList<Fruit> fruitList = new ArrayList<>();
        fruitList.add(fruit1);
        fruitList.add(fruit2);
        User seller = new Seller("Abdul", "Alim", "01325647984","Faridpur",fruitList);
        User buyer = new Buyer("Farhan", "Tausif", "01305584050", "Matikata", 0.0);



        Order order = ((Buyer) buyer).placeOrder( (Seller) seller);
        System.out.println(((Seller) seller).FruitList);
        System.out.println(order.fruits);
        System.out.println(order.quantityInKg);
        Delivery delivery = new Delivery();
        String s = delivery.calculateRoute("Dhaka", "Chittagong");
        System.out.println(s);
        delivery.deliver(order);
        System.out.print("Reward: ");
        System.out.println(((Buyer) buyer).getRewards());
    }
}