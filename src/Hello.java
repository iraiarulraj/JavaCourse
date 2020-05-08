import oop.Calculator;
import oop.Carpet;
import oop.Floor;

public class Hello {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Floor(2.75, 4.0), new Carpet(3.5));
        System.out.println("myFirstNumber : " + calculator.getTotalCost());
    }
}
