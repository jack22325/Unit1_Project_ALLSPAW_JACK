//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Do not use a dollar sign for any amount of money
        System.out.println("Enter the total bill: ");
        String bill = s.nextLine();
        double billNum = Double.parseDouble(bill);

        // Do not use a percentage sign for the tip percentage
        System.out.println("Enter the tip percentage as a whole number: ");
        String tipPercentage = s.nextLine();
        double tipPercentageNum = Double.parseDouble(tipPercentage);
        System.out.println("Enter the amount of people: ");
        String people = s.nextLine();
        int peopleNum = Integer.parseInt(people);

        // Calculating all amounts from previous inputs
        double tipMultiplier = (1+(tipPercentageNum/100));
        double totalBillWithTip = (billNum*tipMultiplier);
        double tipAmount = (totalBillWithTip-billNum);
        double tipPerPerson = (tipAmount/peopleNum);
        double totalBillPerPerson = (totalBillWithTip/peopleNum);

        // Rounding all amounts to the hundreds place
        double totalBillWithTipRounded = ((int) (totalBillWithTip*100)/100.0);
        double tipAmountRounded = ((int) (tipAmount*100)/100.0);
        double tipPerPersonRounded = ((int) (tipPerPerson*100)/100.0);
        double totalBillPerPersonRounded = ((int) (totalBillPerPerson*100)/100.0);

        // Printing all rounded amounts
        System.out.println();
        System.out.println("--------------------");
        System.out.print("Total tip amount: $");
        System.out.println(tipAmountRounded);
        System.out.print("Total bill with tip cost: $");
        System.out.println(totalBillWithTipRounded);
        System.out.print("Tip per person: $");
        System.out.println(tipPerPersonRounded);
        System.out.print("Total bill per person: $");
        System.out.println(totalBillPerPersonRounded);
        System.out.println("--------------------");
        }
    }