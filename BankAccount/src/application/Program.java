package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount account;

        System.out.print("Enter account number: ");
        int acNum = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String acName = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char acDep = sc.next().charAt(0);

        while(acDep !='y' && acDep !='n'){
            System.out.print("Enter y or n: ");
            acDep = sc.next().charAt(0);
        }

        if (acDep =='y'){
            System.out.print("Enter an initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new BankAccount(acNum, acName, initialDeposit);
        } else {
            account = new BankAccount(acNum, acName);
        }

        System.out.printf("%nAccount data:%n");
        System.out.println(account);

        System.out.printf("%nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.newDeposit(depositValue);
        System.out.printf("Updated account data:%n");
        System.out.println(account);

        System.out.printf("%nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.newWithdraw(withdrawValue);
        System.out.printf("Updated account data:%n");
        System.out.println(account);


        sc.close();
    }


}
