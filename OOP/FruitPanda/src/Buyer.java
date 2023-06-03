import java.util.*;
public class Buyer extends User{
    private String address;
    private double rewards;
    Order order;
    Buyer(String firstName, String lastName, String phoneNumber, String address, double rewards) {
        super(firstName, lastName, phoneNumber);
        this.address = address;
        this.rewards = rewards;
       // this.order = order;
    }

    public String getAddress() {
        return address;
    }

    public double getRewards() {
        return rewards;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRewards(double rewards) {
        this.rewards = rewards;
    }

    public Order placeOrder(Seller seller) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Displaying the fruits");

       for(Fruit fruitList: seller.FruitList) {
           System.out.println("Name: " + fruitList.getName());
           System.out.println("Variety: " + fruitList.getVariety());
           System.out.println("PricePerKg: " + fruitList.getPricePerKg());

       }

       System.out.println("How many fruits do you wanna buy? ");
       int n = scanner.nextInt();
       scanner.nextLine();

        order= new Order();

       for(int i=0; i<n; i++) {
           System.out.println("Enter the fruit name: ");
           String fruit = scanner.nextLine();
           System.out.println("Enter the quantity in Kg: ");
           double quantity = scanner.nextDouble();
           scanner.nextLine();
           for(Fruit fruitList: seller.FruitList) {
               if(fruitList.getName().equals(fruit)){
                   order.fruits.add(fruitList);
                   order.quantityInKg.add(quantity);
               }
           }
       }
        order= new Order(order.fruits, order.quantityInKg, this, seller);
        return order;

    }

    public void display(){
        System.out.println();
        System.out.println(this.firstName+" "+this.lastName);
        System.out.println("Ordered fruits -");
        System.out.println("Name\tVariety\tQuantity\tTPrice");
        for(int i=0; i<this.order.fruits.size(); i++){
            System.out.println(this.order.fruits.get(i).getName() +"\t"+ this.order.fruits.get(i).getVariety() +" "+this.order.quantityInKg.get(i)+"\t"+this.order.quantityInKg.get(i)* this.order.fruits.get(i).getPricePerKg());
        }
        System.out.println("\nRewards - "+rewards);
    }
}
