package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;

import com.cbfacademy.accounts.Account;
import com.cbfacademy.accounts.CurrentAccount;
import com.cbfacademy.accounts.SavingsAccount;

public class App {
    // Create a list to store accounts
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
        private static void applyInterestToSavingsAccounts() {
            for (Account account : accountsList) {
                if (account instanceof SavingsAccount) {
                    ((SavingsAccount) account).applyInterest();
                    System.out.println("Interest applied to: " + account);
                }
            }
        }
        }


         // System.out.println("Hello World!");
        // Showroom car = new Showroom();
        // getCars();

        // for (Car car : cars) {
        //     System.out.println(car.getCars());
        // }