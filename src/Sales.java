import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */

public class Sales {

    public static void main(String[] args) {

        DecimalFormat roundTo2 = new DecimalFormat(("0.00"));

        double price;
        int discount, quantity, tax;

        quantity = Integer.parseInt(JOptionPane.showInputDialog("How many items did you buy?"));
        price = Double.parseDouble(JOptionPane.showInputDialog("What was the price?"));
        discount = Integer.parseInt(JOptionPane.showInputDialog("What was your discount as an integer?"));
        tax = Integer.parseInt(JOptionPane.showInputDialog("What was your sales tax as an integer?"));

        double discountRate = discount/100.00;
        double taxRate = tax/100.00;

        double subTotal = quantity * price;
        double discountTotal = subTotal * (1 - discountRate);

        double totalCost = discountTotal * (1 + taxRate);
        double taxTotal = totalCost - discountTotal;

        String discTotDisplay = roundTo2.format(discountTotal);
        String taxTotDisplay = roundTo2.format(taxTotal);
        String costTotDisplay = roundTo2.format(totalCost);

        JOptionPane.showMessageDialog(null, "Your subtotal was: $" + discTotDisplay + ", Your tax amount was: $" + taxTotDisplay + ", and your total cost is: $" + costTotDisplay + ".");

        System.exit(0);

    }

}
