
abstract class Car implements Vehicle {
    protected String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println(brand + " car has started.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " car has stopped.");
    }

    @Override
    public void HorsePowerLevel() {
        System.out.println("Car's horsepower level is about 180hp to 200hp.");
    }
}