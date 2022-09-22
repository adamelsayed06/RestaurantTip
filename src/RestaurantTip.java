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

        /* while the output doesn't equal -1, it repeats and adds every input into a variable named "total" which we
        need for displaying the ouput, not every individual input is needed.
        */

        while (currentInput != -1){
                System.out.print("Please enter a cost in dollars and cents (-1 to end) ");
                currentInput = scan.nextDouble();
                total = total + currentInput;

        }

        total ++;

        System.out.println("------------------------------------");

        /* whenever you see clean/dirty here, dirty refers to the variable before it is cut down to 2 decimal points,
        clean refers to after it has been cut down
        */
        String totalClean = formatter.format(total);

        System.out.println("Total Bill Before Tip: " + totalClean);

        System.out.println("Tip Percentage: " + tipPercent);

        double tipDirty = ((total * 1.00)) * (tipPercent * 1.00) / 100;
        String tipClean = formatter.format(tipDirty);

        System.out.println("Total Tip: " + (tipClean));

        //this translates the string into a double so we can use it in operations
        double tipClean2 = Double.parseDouble(tipClean);

        double totalWithTipDirty = ((total) + tipClean2);
        String totalWithTipClean = formatter.format(totalWithTipDirty);

        System.out.println("Total Bill With Tip: " + (totalWithTipClean));

        double perPersonCostBeforeTipDirty = total/guestNumber;
        String perPersonCostBeforeTipClean = formatter.format(perPersonCostBeforeTipDirty);

        System.out.println("Per Person Cost Before Tip: " + perPersonCostBeforeTipClean);

        double tipPersonDirty = (tipClean2) / (guestNumber);
        String tipPersonClean = formatter.format(tipPersonDirty);

        System.out.println("Tip Per Person: " + (tipPersonClean));

        double totalCostPerPersonDirty = (tipClean2 + total) / guestNumber;
        String totalCostPerPersonClean = formatter.format(totalCostPerPersonDirty);

        System.out.println("Total Cost Per Person: " + totalCostPerPersonClean);

    }
}
