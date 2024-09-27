import com.iit.oop.BankAccount;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(232788,"2357249");


        System.out.println("Welcome to bank ");
        System.out.println("Enter 1 to Withraw or 2 to Deposit");

        int user =  scanner.nextInt();



        if (user == 1){
            System.out.println("Enter amount to Deposit");
            double deposit = scanner.nextDouble();
        }else{
            System.out.println("Enter amount to withraw");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
        }



//        account.deposit(25678);
//        account.withdraw(12344);

        System.out.println("Balance is : "+account.getBalance());
    }
}