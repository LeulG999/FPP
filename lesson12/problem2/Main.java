package lesson12.problem2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        CustomerAccount c1=new CustomerAccount("Leul","0007",2000);
        try{
            c1.deposit(-200);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
       try {
           c1.withdraw(3000);
       }
       catch (AccountException e){
           System.out.println(e.getMessage());
       }
       try {
           c1.withdraw(1950);
       }
       catch (AccountException e){
           System.out.println(e.getMessage());
       }
        System.out.println(c1.getBalance());
        }
    }

