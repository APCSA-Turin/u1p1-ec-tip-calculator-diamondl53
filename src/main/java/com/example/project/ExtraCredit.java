package com.example.project;
import java.text.DecimalFormat;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 
                double totalBill = cost;
                double totalTip = totalBill*(percent/100.0);
                double billwithTip = totalBill+totalTip;
                double personCost = totalBill/people;
                double personTip = totalTip/people;
                double personcostwithTip = personCost+personTip;
                String pattern = "##.##";
                //Here is where I researched rounding: https://jenkov.com/tutorials/java-internationalization/decimalformat.html//
                DecimalFormat decimalFormat = new DecimalFormat(pattern);
                result.append("-------------------------------\n");
                result.append("Total bill before tip: $"+ decimalFormat.format(totalBill) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
                result.append("Total percentage: "  + decimalFormat.format(percent) + "%\n");
                result.append("Total tip: $" + decimalFormat.format(totalTip) + "\n");
                result.append("Total Bill with tip: $" + decimalFormat.format(billwithTip) + "\n");
                result.append("Per person cost before tip: $" + decimalFormat.format(personCost) + "\n");
                result.append("Tip per person: $" +decimalFormat.format(personTip) + "\n");
                result.append("Total cost per person: $" + decimalFormat.format(personcostwithTip) + "\n");
                result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);
        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 59;
         String items = ""; 

        //Your scanner object and while loop should go here
        Scanner scan = new Scanner(System.in);
        String answer = "";//user input
        
        while(!answer.equals("-1")){
            System.out.println("Enter an item name or type '-1' to finish:");
            answer = scan.nextLine();
        //if it is not -1, it will keep asking the same thing//
        if (!answer.equals("-1")){
            items += answer + "\n"; //concatenates to items with a new line//
        }
        }
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
