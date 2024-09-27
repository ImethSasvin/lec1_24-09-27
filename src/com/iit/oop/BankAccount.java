package com.iit.oop;

import java.util.SplittableRandom;

public class BankAccount {

    int amount;
    private double balance;
    private String accountNum;


    /** Default constructor **/
    public BankAccount(){
      super();
    }

    /**
     *
     * Constructor for the bank account class
     *
     */

    public BankAccount(double balance, String accountNum){
        this.balance=balance;
        this.accountNum = accountNum;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }

    public Double getBalance(){
        return balance;
    }
}
