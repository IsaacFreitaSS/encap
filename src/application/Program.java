package application;

import entites.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("enter account number: ");
        int number = sc.nextInt();
        System.out.println("enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.println("is there initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.println("enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account (number, holder, initialDeposit);
        }
        else {
            account = new Account (number, holder);
        }

        System.out.println();
        System.out.println("account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
