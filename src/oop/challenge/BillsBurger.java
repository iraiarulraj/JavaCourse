package oop.challenge;

public class BillsBurger {
    public static void main(String[] args) {
        HamBurger hamBurger = new HamBurger("wheat", "chicken", 4, "HamBurger");
        hamBurger.setAdditions(4);
        System.out.println("HamBurger cost is: " + hamBurger.getCost());

        HealthyBurger healthyBurger = new HealthyBurger("Brown Rye", "chicken", 6, "Healthy Burger");
        healthyBurger.setAdditions(6);
        System.out.println("Healthy Burger cost is : " + healthyBurger.getCost());

        DeluxeBurger deluxeBurger = new DeluxeBurger("Italian", "chicken", 6, "Deluxe Burger");
        System.out.println("DeluxeBurger cost is : " + deluxeBurger.getCost());
    }
}

class HamBurger{
    private String breadRollType;
    private String meat;
    private double price = 4;
    private String name;
    private int additions;
    private int additionsCost = 1;
    private int maxAdditions = 4;

    public HamBurger(String breadRollType, String meat, double price, String name) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public int getAdditions() {
        return additions;
    }

    public void setAdditions(int additions) {
        this.additions = additions;
    }

    public double getCost(){
        return price + (additions * additionsCost);
    }
}

class HealthyBurger extends HamBurger{
    private String breadRollType = "Brown Rye";
    private String meat;
    private double price = 6;
    private String name;
    private int additions;
    private int additionsCost = 1;
    private int maxAdditions = 6;

    public HealthyBurger(String breadRollType, String meat, double price, String name) {
        super(breadRollType, meat, price, name);
    }

    @Override
    public int getAdditions() {
        return additions;
    }

    @Override
    public void setAdditions(int additions) {
        this.additions = additions;
    }

    @Override
    public double getCost() {
        return price + (additions * additionsCost);
    }
}

class DeluxeBurger extends HamBurger{
    private String breadRollType;
    private String meat;
    private double price = 6;
    private String name;
    private int additions = 2;
    private int additionsCost = 1;
    private int maxAdditions = 2;

    public DeluxeBurger(String breadRollType, String meat, double price, String name) {
        super(breadRollType, meat, price, name);
    }

    @Override
    public int getAdditions() {
        return additions;
    }

    @Override
    public void setAdditions(int additions) {
        this.additions = 2;
    }

    @Override
    public double getCost() {
        return price + (additions * additionsCost);
    }
}