package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.List;

public class Bank extends Account {
    public Bank(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

private static List<Account> accountsList = new ArrayList<>();
    public static void main(String[] args) {
                // Add instances of each class to the list
                accountsList.add(new Account(001, 1000.0));
                accountsList.add(new SavingsAccount(002, 2000.0, 1.5));
                accountsList.add(new CurrentAccount(003, 3000.0, 500.0));
        
                // Print the accounts in the list
                for (Account account : accountsList) {
                    System.out.println(account);
                }
            }
        // Apply interest to savings account
        private static void applyInterestToSavingsAccounts() {
            for (Account account : accountsList) {
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).applyInterest();
                    System.out.println("Interest applied to: " + account);
                }
            }
        }

        // Display a report of all accounts held by the bank
        private static void displayReport() {
            System.out.println("Bank Accounts Report");
            for (Account account : accountsList) {
                System.out.println(account);
            }
            System.out.println(" ");
        }
        }

