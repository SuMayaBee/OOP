import java.util.*;
public class Order {
    ArrayList<Fruit> fruits;
    ArrayList<Double> quantityInKg;

    Buyer buyer;
    Seller seller;

    Order(ArrayList<Fruit> fruits, ArrayList<Double> quantityInKg, Buyer buyer, Seller seller) {
        this.fruits = fruits;
        this.quantityInKg = quantityInKg;
        this.buyer = buyer;
        this.seller = seller;
    }

    Order() {
        this.fruits = new ArrayList<Fruit>();
        this.quantityInKg = new ArrayList<Double>();
    }
}
