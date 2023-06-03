public class Fruit {
    private String name;
    private String variety;
    private double totalQuantityKg;
    private double pricePerKg;

    Fruit(String name, String variety, double totalQuantityKg, double pricePerKg ) {
        this.name = name;
        this.variety = variety;
        this.totalQuantityKg = totalQuantityKg;
        this.pricePerKg = pricePerKg;
    }

    public void setTotalQuantityKg(double totalQuantityKg) {
        this.totalQuantityKg = totalQuantityKg;
    }

    public double getTotalQuantityKg() {
        return totalQuantityKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }


    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", variety='" + variety + '\'' +
                ", totalQuantityKg=" + totalQuantityKg +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
