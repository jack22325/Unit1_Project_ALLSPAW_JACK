//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the total bill: ");
        String bill = s.nextLine();
        double billNum = Double.parseDouble(bill);
        System.out.println("Enter the tip percentage as a whole number: ");
        String tipPercentage = s.nextLine();
        double tipPercentageNum = Double.parseDouble(tipPercentage);
        System.out.println("Enter the amount of people: ");
        String people = s.nextLine();
        int peopleNum = Integer.parseInt(people);
        double tipMultiplier = (1+(tipPercentageNum/100));
        double totalBillWithTip = (billNum*tipMultiplier);
        double tipAmount = (totalBillWithTip-billNum);
        double tipPerPerson = (tipAmount/peopleNum);
        double totalBillPerPerson = (totalBillWithTip/peopleNum);
        double totalBillWithTipRounded = (double) ((int) (totalBillWithTip*100)/100.0);
        double tipAmountRounded = (double) ((int) (tipAmount*100)/100.0);
        double tipPerPersonRounded = (double) ((int) (tipPerPerson*100)/100.0);
        double totalBillPerPersonRounded = (double) ((int) (totalBillPerPerson*100)/100.0);
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