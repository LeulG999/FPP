package lesson12.problem1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean validInput=false;
        do {
             try {
                 System.out.println("Enter quantity of items to add (1-50): ");
                 int quantity = sc.nextInt();
                 if(quantity<1 || quantity>50){
                     throw new IllegalArgumentException(" Please enter a number from 1 to 50");
                 }
                 System.out.println("Successfully added " + quantity + " items to your cart!");
                 validInput=true;
             }
             catch (IllegalArgumentException e){
                 System.out.println(e.getMessage());
             }
             catch (InputMismatchException e) {
                 System.out.println("Please enter integer value");
                 sc.next();
             }
         }
         while(!validInput);
       }
}
