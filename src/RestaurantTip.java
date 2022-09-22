import java.util.Scanner;
import java.text.DecimalFormat;
public class RestaurantTip {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Hello, and welcome to the program for calculating your restaurant tip!");

        System.out.print("How many people are in your group eating at the restaurant (including yourself)? ");
        int guestNumber = scan.nextInt();

        System.out.println();
        System.out.print("How much do you want to tip, as an integer (omit the percent symbol)? ");
        int tipPercent = scan.nextInt();

        double currentInput = 0;
        double total = 0;

        while (currentInput != -1){
                System.out.print("Please enter a cost in dollars and cents (-1 to end) ");
                currentInput = scan.nextDouble();
                total = total + currentInput;

        }

        total ++;

        System.out.println("------------------------------------");

        System.out.println("Total Bill Before Tip: " + total);

        System.out.println("Tip Percentage: " + tipPercent);

        double tipDirty = ((total * 1.00)) * (tipPercent * 1.00) / 100;
        String tipClean = formatter.format(tipDirty);
        System.out.println("Total Tip: " + (tipClean));

        double tipClean2 = Double.parseDouble(tipClean);

        System.out.println("Total Bill With Tip: " + ((total) + tipClean2));

        System.out.println("Per Person Cost Before Tip: " + (total/guestNumber));

        // Format tip per person using the formatter.format so that it is in dollars and cents

        System.out.println("Tip Per Person: " + ((tipClean2) / (guestNumber)));

        System.out.println("Total Cost Per Person: " + (tipClean2 + total) / guestNumber);

    }
}
