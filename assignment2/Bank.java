package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bank {
    // Instance variables
    private String bankName; // Bank name
    private String branchLocation; // Branch location
    private List<Account> accounts; // Collection of accounts

    public static enum BranchLocations {
        location1,
        location2,
        location3,
        location4,
        location5
    }; // Enum for branch locations

    // Default constructor
    public Bank() {
        accounts = new ArrayList<>();
        this.bankName = "DefaultBank"; // Set default bank name
    }

    // Constructor with 2 arguments: bankName and branchLocation as String
    public Bank(String bankName, String branchLocation) {
        // Setting the instance variables with validations
        if (isBankNameValid(bankName))
            this.bankName = bankName;
        else
            this.bankName = "DefaultBank"; // Initializing with a default value

        this.branchLocation = branchLocation;

        accounts = new ArrayList<>();
    }

    // Constructor with 2 arguments: bankName and branchLocation as BranchLocations enum
    public Bank(String bankName, BranchLocations branchLocation) {
        // Setting the instance variables with validations
        if (isBankNameValid(bankName))
            this.bankName = bankName;
        else
            this.bankName = "DefaultBank"; // Initializing with a default value

        this.branchLocation = branchLocation.toString();

        accounts = new ArrayList<>();
    }

    // Getter for bankName
    public String getBankName() {
        return bankName;
    }

    // Setter for bankName
    public boolean setBankName(String bankName) {
        // Validating and updating the bankName
        if (isBankNameValid(bankName)) {
            this.bankName = bankName;
            return true;
        }
        return false;
    }

    // Setter for branchLocation as String
    public boolean setBranchLocation(String branchLocation) {
        // Validating and updating the branchLocation
        if (isBranchLocationValid(branchLocation)) {
            this.branchLocation = branchLocation;
            return true;
        }
        return false;
    }

    // Setter for branchLocation as BranchLocations enum
    public boolean setBranchLocation(BranchLocations branchLocation) {
        return setBranchLocation(branchLocation.toString());
    }

    // Getter for branchLocation
    public String getBranchLocation() {
        return branchLocation;
    }

    // Method to add an account to the bank
    public boolean addAccount(Account account) {
        // Checking if the account already exists
        if (accounts.contains(account))
            return false;

        // Adding the account to the list
        accounts.add(account);
        return true;
    }

    // Method to add an account to the bank using individual account attributes
    public boolean addAccount(String accountName, int accountNumber, double accountBalance) {
        // Creating a new account
        Account account = new Account(accountName, accountNumber, accountBalance);
        return addAccount(account);
    }

    // Method to view an account at a given index
    public Account viewAccount(int index) {
        // Checking if the index is within bounds
        if (index >= 0 && index < accounts.size())
            return accounts.get(index);

        // Returning an empty account if index is invalid
        return new Account();
    }

    // Method to modify the account name of an account
    public boolean modifyAccount(int accountNumber, String newAccountName) {
        // Finding the account with the given account number
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                // Modifying the account name
                return account.setAccountName(newAccountName);
            }
        }

        return false; // Account not found
    }

    // Method to modify the account number of an account
    public boolean modifyAccount(int accountNumber, int newAccountNumber) {
        // Finding the account with the given account number
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                // Modifying the account number
                return account.setAccountNumber(newAccountNumber);
            }
        }

        return false; // Account not found
    }

    // Method to modify the account balance of an account
    public boolean modifyAccount(int accountNumber, double newAccountBalance) {
        // Finding the account with the given account number
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                // Modifying the account balance
                return account.setAccountBalance(newAccountBalance);
            }
        }

        return false; // Account not found
    }

    // Method to modify the account name and balance of an account
    public boolean modifyAccount(int accountNumber, String newAccountName, double newAccountBalance) {
        // Finding the account with the given account number
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                // Modifying the account name and balance
                return account.setAccountName(newAccountName) && account.setAccountBalance(newAccountBalance);
            }
        }

        return false; // Account not found
    }

    // Method to delete an account by account number
    public boolean deleteAccount(int accountNumber) {
        // Finding the account with the given account number
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                // Removing the account from the list
                accounts.remove(account);
                return true;
            }
        }

        return false; // Account not found
    }

    // Method to delete an account by index
    public boolean deleteAccount(byte index) {
        // Checking if the index is within bounds
        if (index >= 0 && index < accounts.size()) {
            // Removing the account from the list
            accounts.remove(index);
            return true;
        }

        return false; // Index is invalid
    }

    // Method to check the validity of bankName
    public boolean isBankNameValid(String bankName) {
        /**
         * The bank name can contain only uppercase and lowercase letters (a-z, A-Z) and spaces.
         * It should be a minimum of 8 characters and a maximum of 30 characters.
         */

        String regex = "[A-Za-z ]{8,30}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(bankName);
        return matcher.matches();
    }

    // Method to check the validity of branchLocation
    public boolean isBranchLocationValid(String branchLocation) {
        // Validating branchLocation using the BranchLocations enum
        for (BranchLocations location : BranchLocations.values()) {
            if (location.toString().equals(branchLocation))
                return true;
        }

        return false;
    }
}
