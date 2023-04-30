package entities;

import java.util.Scanner;

public class BankAccount {
    private int acNum;
    private String acName;
    private double acBalance;
    private char acDep;

    public BankAccount(int acNum, String acName) {
        this.acNum = acNum;
        this.acName = acName;
    }
    public BankAccount(int acNum, String acName, double initialDeposit) {
        this.acNum = acNum;
        this.acName = acName;
        newDeposit(initialDeposit);
    }

    public int getAcNum() {
        return acNum;
    }
    public String getAcName() {
        return acName;
    }
    public void setAcName(String acName) {
        this.acName = acName;
    }
    public char getAcDep() {
        return acDep;
    }
    public void setAcDep(char acDep) {
        this.acDep = acDep;
    }
    public double getAcBalance() {
        return acBalance;
    }


    public String toString(){
        return "Account "
                + acNum
                + ", Holder: "
                + acName
                + ", Balance: $ "
                + String.format("%.2f",acBalance);
    }

    public void newDeposit(double amount){
        acBalance += amount;
    }

    public void newWithdraw(double amount){
        acBalance -= amount+5;
    }

}
