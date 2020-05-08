package oop;

public class Polymorphism {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            Car car = getCar();
            car.accelerate();
            car.startEngine();
        }
    }
    public static Car getCar(){
        Car car = new Car("", 2, 4);
        int count = (int) (Math.random() * 3) + 1;
        switch (count){
            case 1:
                return new Bugatti("", 2, 6);
            case 2:
                return new Bronco("", 4, 8);
        }
        return car;
    }

}

class Car{
    private String engine;
    private int cylinders;
    private int wheels;

    public Car(String engine, int cylinders, int wheels) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void startEngine(){
        System.out.println("Car - Engine started");
    }

    public void accelerate(){
        System.out.println("Car - accelerate called");
    }
}

class Bugatti extends Car{

    public Bugatti(String engine, int cylinders, int wheels) {
        super(engine, cylinders, wheels);
    }

    @Override
    public void startEngine() {
        System.out.println("Bugatti engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bugatti accelerate called");
    }
}

class Bronco extends Car{

    public Bronco(String engine, int cylinders, int wheels) {
        super(engine, cylinders, wheels);
    }

    @Override
    public void startEngine() {
        System.out.println("Bronco engine started");
    }

    @Override
    public void accelerate() {
        System.out.println("Bronco accelerate called");
    }
}
