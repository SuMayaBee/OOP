import java.util.*;
public class Seller extends User {
    protected String address;
    ArrayList<Fruit> FruitList;

    Seller(String firstName, String lastName, String phoneNumber, String address, ArrayList<Fruit> FruitList ) {
        super(firstName, lastName, phoneNumber);
        this.address = address;
        this.FruitList = FruitList;
    }

    public void display(){
        System.out.println();
        System.out.println(this.firstName+" "+this.lastName);
        System.out.println("Name\tVariety\tQuantity\tPrice");
        for(Fruit f:FruitList){
            System.out.println(f.getName() +"\t"+ f.getVariety() +"\t"+ f.getTotalQuantityKg() +"\t"+ f.getPricePerKg());
        }
    }



}
