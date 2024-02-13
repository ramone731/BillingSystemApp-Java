import java.util.ArrayList;
import java.util.Scanner;

public class SuperMarketBilling{
    public static void main(String[] args) {

        //arraylist to store items
        ArrayList items = new ArrayList();
        //scanner obj to read user input
        Scanner scanner = new Scanner(System.in);

        //Declare variables for calculatorions
        double total = 0;
        double subTotal = 0;
        double tax = 0;
        double discount = 0;
        double finalTotal = 0;

        //customer: greeting & prompt
        System.out.println("Welcome to the super Billing");
        System.out.println("Enter the item details: ");

        //loop to input items
        while (true){
            System.out.println("Enter item name (or 'exit' to finish): ");
            String itemName = scanner.next();
            if(itemName.equalsIgnoreCase(anotherString: "exit")){
                break;
            }


            System.out.println("Enter item quantity: ");
            itn itemQuantity = scanner.nextInt();

            System.out.println("Enter item price: ");
            double itemPrice = scanner.nextDOuble();


            //Item ojb
            Item item = new Item(itemName, itemQuantity, itemPrice);
            //add the item to the list
            items.add(item);

            //calculate subtotal
            subTotal += itemQuantity * itemPrice;

            //output item info
            System.out.println("Item: " + itemName + ", Quantity: " + itemQuantity + ", Price: $" + itemPrice);
        }
        //Get Tax: rate &  calculation
        System.out.println("Enter the tax rate (%): ");
        double taxRate = scanner.nextDouble();
        tax = (taxRate * subTotal)/100;

        //discount
        System.out.println("Enter the discount amount($): ");
        discount = scanner.nextDouble();

        //total-amount
        finalTotal = subTotal + tax - discount;

        //print billing
        System.out.println("Subtoal: $ " + subTotal);
        System.out.println("Tax: $" + tax);
        System.out.println("DiscountsL $" + discount);
        System.out.println("Total: $" + finalTotal);
    }
}

