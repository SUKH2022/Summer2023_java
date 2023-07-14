package assignment2;

//libraries
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    // Instance variables in the account class
    private int accountNumber; // Account number
    private String accountName; // Account name
    private double accountBalance; // Account balance

    // Default constructor
    public Account() {
        this.accountName = ""; // Initialize accountName with an empty string
    }

    // Constructor with 3 arguments
    public Account(String accountName, int accountNumber, double accountBalance) {
        // Setting the instance variables with validations
        if (isAccountNumberValid(accountNumber))
            this.accountNumber = accountNumber;
        else
            this.accountNumber = 5959; // Assign a default value if accountNumber is invalid

        if (isAccountBalanceValid(accountBalance))
            this.accountBalance = accountBalance;
        else
            this.accountBalance = 1.00; // Assign a default value if accountBalance is invalid

        if (isAccountNameValid(accountName))
            this.accountName = accountName;
        else
            this.accountName = "DefaultAccount"; // Assign a default value if accountName is invalid
    }

    // Getter for accountName
    public String getAccountName() {
        return accountName;
    }

    // Setter for accountName
    public boolean setAccountName(String accountName) {
        // Validating and updating the accountName
        if (isAccountNameValid(accountName)) {
            this.accountName = accountName;
            return true;
        }
        return false;
    }

    // Getter for accountNumber
    public int getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public boolean setAccountNumber(int accountNumber) {
        // Validating and updating the accountNumber
        if (isAccountNumberValid(accountNumber)) {
            this.accountNumber = accountNumber;
            return true;
        }
        return false;
    }

    // Getter for accountBalance
    public double getAccountBalance() {
        return accountBalance;
    }

    // Setter for accountBalance
    public boolean setAccountBalance(double accountBalance) {
        // Validating and updating the accountBalance
        if (isAccountBalanceValid(accountBalance)) {
            this.accountBalance = accountBalance;
            return true;
        }
        return false;
    }

    // Overriding the equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (Double.doubleToLongBits(accountBalance) != Double.doubleToLongBits(other.accountBalance))
            return false;
        if (accountName == null) {
            if (other.accountName != null)
                return false;
        } else if (!accountName.equals(other.accountName))
            return false;
        if (accountNumber != other.accountNumber)
            return false;
        return true;
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    // Method to check the validity of accountName
    public boolean isAccountNameValid(String accountName) {
        /**
         * The account name can only contain the following characters:
         * The letters a to z (upper and lowercase) (zero or many times)
         * The hyphen character (zero or many times)
         * The single quote character (zero or one time)
         * The space character (zero or one time)
         * The account name must be a minimum of 4 characters
         */

        String RegExpr = "(?=.{4,})([A-Za-z\\-]*+[ ']?+)+";

        Pattern pattern = Pattern.compile(RegExpr);
        Matcher matcher = pattern.matcher(accountName);
        return matcher.matches();
    }

    // Method to check the validity of accountNumber
    public boolean isAccountNumberValid(int accountNumber) {
        /**
         * Conditions to be satisfied:
         * 1. Should contain only positive numeric values.
         * 2. Must be between 5-9 digits (both inclusive).
         */

        // Condition 1
        if (accountNumber <= 0)
            return false;

        // Condition 2
        int numberOfDigits = Integer.toString(accountNumber).length();
        if (numberOfDigits < 5 || numberOfDigits > 9)
            return false;

        return true;
    }

    // Method to check the validity of accountBalance
    public boolean isAccountBalanceValid(double accountBalance) {
        /**
         * The account balance can contain positive and negative values but must have a maximum
         * precision of 2 decimal places.
         * Good values: 10, 10.1, 10.22, .1, .23, 0.87, -3.34, -100
         * Not good values: .333, 10.579
         */

        double modAccountBalance = Math.abs(accountBalance);
        if (modAccountBalance * 100 > (double) (int) (modAccountBalance * 100))
            return false;

        return true;
    }
}