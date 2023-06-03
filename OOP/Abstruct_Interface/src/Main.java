public class Main {
    public static void main(String[] args) {
        SportsCar tesla = new SportsCar("Tesla");
        tesla.start();
        tesla.accelerate();
        tesla.accelerate();
        tesla.decelerate();
        tesla.stop();

        System.out.println();

        Car cybertruck = new Truck("CyberTruck");
        cybertruck.start();
        cybertruck.HorsePowerLevel();

    }
}