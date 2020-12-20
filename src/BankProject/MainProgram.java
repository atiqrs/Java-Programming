package BankProject;
import java.lang.Math;
import java.util.Scanner;
import java.lang.Object;
public class MainProgram {
    public static void main (String arg[]){
        //A current account create
        CurrentAcc user1 = new CurrentAcc(10, "Atiqur"); 
        System.out.println("Your balance is: "+user1.getBalance());
        user1.depositMoney (1000);
        System.out.println("After diposit your balance is: "+user1.getBalance());
        user1.yearlyInterest();
        System.out.println("After adding interest your balance is: "+user1.getBalance());
        user1.withdrawMoney(1000);
        System.out.println("After withdraw your balance is: "+user1.getBalance());
        
        System.out.println();
        //A savings account create
        SavingsAcc user2 = new SavingsAcc(10, "Atiqur"); 
        System.out.println("Your balance is: "+user2.getBalance());
        user2.depositMoney (5000);
        System.out.println("After diposit your balance is: "+user2.getBalance());
        user2.yearlyInterest();
        System.out.println("After adding interest your balance is: "+user2.getBalance());
        user2.withdrawMoney(500);
        System.out.println("After withdraw your balance is: "+user2.getBalance());
    }
}

