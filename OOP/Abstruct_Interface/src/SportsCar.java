
class SportsCar extends Car {
    private int currentSpeed;

    public SportsCar(String brand) {
        super(brand);
        this.currentSpeed = 0;
    }

    @Override
    public void accelerate() {
        currentSpeed += 10;
        System.out.println(brand + " sports car is accelerating. Current speed: " + currentSpeed);
    }

    @Override
    public void decelerate() {
        if (currentSpeed > 0) {
            currentSpeed -= 10;
            System.out.println(brand + " sports car is decelerating. Current speed: " + currentSpeed);
        } else {
            System.out.println(brand + " sports car has already stopped.");
        }
    }

    @Override
    public void HorsePowerLevel() {
        System.out.println("Sports car's horsepower level is about 400HP. ");
    }
}