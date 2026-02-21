//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class ShipCostCalculator {
    void main() {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        double shipCost;
        double shipTax = 0.02;
        double finalPrice;
        String trash = "";

        System.out.println("Enter the price of the item: ");
        itemPrice = in.nextDouble();

        if (itemPrice >= 100) {
            shipCost = 0;
            finalPrice = itemPrice;
        } else {
            shipCost = shipTax * itemPrice;
            finalPrice = shipCost + itemPrice;
        }

        System.out.println("The shipping cost is: $" + shipCost);
        System.out.println("The total price is: $" + finalPrice);
        in.close();

    }
}
