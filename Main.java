import java.util.Scanner;
/**
 * Gets quantities of computer parts for purchase and calculates the subtotal, tax and total cost of the purchase
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner used for input
    Scanner input = new Scanner(System.in);

    //initialize the variables
    int chargerCount; //amount of chargers
    int boardCount; //amount of motherboards
    int mouseCount; //amount of mice
    double subtotal; //total cost before tax
    double tax; //total tax of all items
    double total; //the sum of the subtotal and sales tax

    //initialize and declare constants
    final double CHARGER_COST = 34.99; //cost of chromebook charger
    final double BOARD_COST = 127.50; //cost of motherboard
    final double MOUSE_COST = 18.00; //cost of mouse
    final double SALES_TAX = 0.13; //what to multiply the the subtotal by to get tax

    //ask for inputs
    System.out.println("How many chromebook chargers?"); //ask user amount of chromebook chargers to purchase
    chargerCount = input.nextInt(); //store result in charger count variable
    System.out.println("How many motherboards?"); //ask user amount of motherboards to purchase
    boardCount = input.nextInt(); //store result in motherboard count variable
    System.out.println("How many mice?"); //ask user amount of mice to purchase
    mouseCount = input.nextInt(); //store result in mouse count variable

    //calculate amounts
    subtotal = (chargerCount*CHARGER_COST) + (boardCount*BOARD_COST) + (mouseCount*MOUSE_COST); //multiply the amount of each part with their respective costs to get the subtotal
    tax = subtotal*SALES_TAX; //multiply subtotal with the sales tax to get tax of all items
    total = subtotal + tax; //add subtotal to tax to get total

    //tell user subtotal, tax and total cost of their purchase
    System.out.println("Subtotal= $" + subtotal); //print the final subtotal
    System.out.println("Taxes = $" + tax); //print the final tax
    System.out.println("Total = $" + total); //print the final total
  }
}
